package DAO;

import metier.Evenement;

public class EvenementDAO extends AbstractJpaDao<Long, Evenement> {

    public EvenementDAO(){
        super(Evenement.class);
    }
}
