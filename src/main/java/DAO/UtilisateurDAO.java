package DAO;

import jakarta.persistence.EntityManager;
import metier.Utilisateur;

import java.util.List;

public class UtilisateurDAO extends AbstractJpaDao<Long, Utilisateur> {

    public UtilisateurDAO(){
        super(Utilisateur.class);
    }


}
