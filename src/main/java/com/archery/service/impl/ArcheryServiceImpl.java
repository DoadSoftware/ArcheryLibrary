package com.archery.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.archery.dao.ArcheryDao;
import com.archery.model.Player;
import com.archery.model.Team;
import com.archery.service.ArcheryService;

@Service("archeryService")
@Transactional
public class ArcheryServiceImpl implements ArcheryService {
    @Autowired private ArcheryDao archeryDao;
    public Player getPlayer(int playerId) { return archeryDao.getPlayer(playerId); }
    public Team getTeam(int teamId) { return archeryDao.getTeam(teamId); }
    public List<Player> getPlayers(int teamId) { return archeryDao.getPlayers(teamId); }
    public List<Team> getTeams() { return archeryDao.getTeams(); }
}
