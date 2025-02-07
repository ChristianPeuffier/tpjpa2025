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
			EntityManager manager = EntityManagerHelper.getEntityManager();

		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {

			UtilisateurDAO utilisateurDAO = new UtilisateurDAO(manager);
			if(utilisateurDAO.getUtilisateurByName("Alexis").isEmpty()) {

				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom("Alexis");
				utilisateur.setPrenom("Raulais");
				utilisateur.setEmail("Alexisr0910@gmail.com");
				utilisateur.setPassword("1234");
				utilisateurDAO.creerUtilisateur(utilisateur);
			}
			else {
				System.out.println("Utilisateur déjà existant");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

			
   	 manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done");
	}




}
