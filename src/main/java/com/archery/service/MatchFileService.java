package com.archery.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.archery.model.ArcheryMatch;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Service
public class MatchFileService {
    private static final Path MATCHES_DIRECTORY=Paths.get("C:\\Sports\\Archery\\Matches").toAbsolutePath().normalize();
    private final ObjectMapper objectMapper;

    public MatchFileService(){
        objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }

    public void ensureDirectory(){
        try{
            Files.createDirectories(MATCHES_DIRECTORY);
        }catch(IOException e){
            throw new RuntimeException("Unable to create matches directory: "+MATCHES_DIRECTORY,e);
        }
    }

    public void saveMatch(ArcheryMatch match){
        ensureDirectory();

        if(match==null){
            throw new IllegalArgumentException("Match is required.");
        }

        if(match.getMatchFileName()==null||match.getMatchFileName().trim().isEmpty()){
            throw new IllegalArgumentException("Match file name is required.");
        }

        String fileName=match.getMatchFileName().trim();

        if(!fileName.toLowerCase().endsWith(".json")){
            fileName=fileName+".json";
        }

        if(!fileName.matches("[a-zA-Z0-9 _-]+\\.json")){
            throw new IllegalArgumentException("Invalid match file name.");
        }

        Path file=MATCHES_DIRECTORY.resolve(fileName).normalize();

        if(!file.getParent().equals(MATCHES_DIRECTORY)){
            throw new IllegalArgumentException("Invalid match file name.");
        }

        try{
            objectMapper.writeValue(file.toFile(),match);
        }catch(IOException e){
            throw new RuntimeException("Unable to save match file: "+file,e);
        }
    }

	public ArcheryMatch loadMatch(String matchFileName){
	    ensureDirectory();
	    if(matchFileName==null||matchFileName.trim().isEmpty()) throw new IllegalArgumentException("Match file name is required.");
	    String fileName=matchFileName.trim();
	    if(!fileName.toLowerCase().endsWith(".json")) fileName=fileName+".json";
	    if(!fileName.matches("[a-zA-Z0-9 _-]+\\.json")) throw new IllegalArgumentException("Invalid match file name.");
	    Path file=MATCHES_DIRECTORY.resolve(fileName).normalize();
	    if(!file.getParent().equals(MATCHES_DIRECTORY)) throw new IllegalArgumentException("Invalid match file name.");
	    if(!Files.exists(file)) throw new IllegalArgumentException("Match file does not exist: "+fileName);
	    try{
	        return objectMapper.readValue(file.toFile(),ArcheryMatch.class);
	    }catch(Exception e){
	        e.printStackTrace();
	        throw new RuntimeException("Unable to load match file: "+file+" | "+e.getClass().getName()+" | "+e.getMessage(),e);
	    }
	}

    public List<String> getMatchFiles(){
        ensureDirectory();

        List<String> files=new ArrayList<>();

        try(Stream<Path> paths=Files.list(MATCHES_DIRECTORY)){
            paths.filter(Files::isRegularFile)
                .filter(path->path.getFileName().toString().toLowerCase().endsWith(".json"))
                .map(path->path.getFileName().toString())
                .sorted()
                .forEach(files::add);
        }catch(IOException e){
            throw new RuntimeException("Unable to read matches directory: "+MATCHES_DIRECTORY,e);
        }

        return files;
    }

    public void deleteMatch(String matchFileName){
        ensureDirectory();

        if(matchFileName==null||matchFileName.trim().isEmpty()){
            return;
        }

        String fileName=matchFileName.trim();

        if(!fileName.toLowerCase().endsWith(".json")){
            fileName=fileName+".json";
        }

        if(!fileName.matches("[a-zA-Z0-9 _-]+\\.json")){
            throw new IllegalArgumentException("Invalid match file name.");
        }

        Path file=MATCHES_DIRECTORY.resolve(fileName).normalize();

        if(!file.getParent().equals(MATCHES_DIRECTORY)){
            throw new IllegalArgumentException("Invalid match file name.");
        }

        try{
            Files.deleteIfExists(file);
        }catch(IOException e){
            throw new RuntimeException("Unable to delete match file: "+file,e);
        }
    }

    public Path getMatchesDirectory(){
        return MATCHES_DIRECTORY;
    }
}