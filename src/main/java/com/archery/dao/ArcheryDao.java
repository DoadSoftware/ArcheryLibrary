package com.archery.dao;
import java.util.List;
import com.archery.model.Player;
import com.archery.model.Team;
public interface ArcheryDao {
    Player getPlayer(int playerId);
    Team getTeam(int teamId);
    List<Player> getPlayers(int teamId);
    List<Team> getTeams();
}
