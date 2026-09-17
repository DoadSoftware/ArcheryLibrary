package com.archery.dao.impl;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.archery.dao.ArcheryDao;
import com.archery.model.Player;
import com.archery.model.Team;

@Transactional
@Repository("archeryDao")
public class ArcheryDaoImpl implements ArcheryDao {
    @Autowired private SessionFactory sessionFactory;

    public Player getPlayer(int playerId) {
        return sessionFactory.getCurrentSession()
            .createQuery("from Player where playerId = :playerId", Player.class)
            .setParameter("playerId", playerId).uniqueResult();
    }
    public Team getTeam(int teamId) {
        return sessionFactory.getCurrentSession()
            .createQuery("from Team where teamId = :teamId", Team.class)
            .setParameter("teamId", teamId).uniqueResult();
    }
    public List<Player> getPlayers(int teamId) {
        return sessionFactory.getCurrentSession()
            .createQuery("from Player where teamId = :teamId order by playerId", Player.class)
            .setParameter("teamId", teamId).getResultList();
    }
    public List<Team> getTeams() {
        return sessionFactory.getCurrentSession()
            .createQuery("from Team order by teamId", Team.class).getResultList();
    }
}
