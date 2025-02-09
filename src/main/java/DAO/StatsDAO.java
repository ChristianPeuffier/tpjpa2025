package DAO;

import metier.Stats;

public class StatsDAO extends AbstractJpaDao<Long, Stats> {

    public StatsDAO(){
        super(Stats.class);
    }

}
