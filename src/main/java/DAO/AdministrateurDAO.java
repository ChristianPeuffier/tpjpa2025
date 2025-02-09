package DAO;

import metier.Administrateur;

public class AdministrateurDAO extends AbstractJpaDao<Long, Administrateur> {

    public AdministrateurDAO(){
        super(Administrateur.class);
    }
}
