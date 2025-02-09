package DAO;

import metier.Organisateur;

public class OrganisateurDAO extends AbstractJpaDao<Long, Organisateur> {

    public OrganisateurDAO(){
        super(Organisateur.class);
    }
}
