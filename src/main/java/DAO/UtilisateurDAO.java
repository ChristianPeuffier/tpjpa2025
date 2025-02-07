package DAO;

import jakarta.persistence.EntityManager;
import metier.Utilisateur;

import java.util.List;

public class UtilisateurDAO {

    private EntityManager entityManager;

    public UtilisateurDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void creerUtilisateur(Utilisateur utilisateur) {
        entityManager.persist(utilisateur);
    }

    public List<Utilisateur> getUtilisateurByName(String nom) {
        return entityManager.createQuery("SELECT u FROM Utilisateur u WHERE u.nom = :nom", Utilisateur.class)
                .setParameter("nom", nom)
                .getResultList();
    }
}
