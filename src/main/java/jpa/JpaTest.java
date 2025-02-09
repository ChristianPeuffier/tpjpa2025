package jpa;


import DAO.UtilisateurDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import metier.Administrateur;
import metier.Utilisateur;

public class JpaTest {


	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			UtilisateurDAO utilisateurDAO = new UtilisateurDAO();

				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom("Alexis");
				utilisateur.setPrenom("Raulais");
				utilisateur.setEmail("Alexisr0910@gmail.com");
				utilisateur.setPassword("1234");
				utilisateurDAO.create(utilisateur);

		} catch (Exception e) {
			e.printStackTrace();
		}

		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done");
	}




}
