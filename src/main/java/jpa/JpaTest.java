package jpa;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import metier.Administrateur;

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

			int numOfAdmins = manager.createQuery("Select a From Administrateur a", Administrateur.class).getResultList().size();
			if (numOfAdmins == 0) {
				Administrateur admin = new Administrateur("admin", "admin", "admin@gmail.com", "admin");
				manager.persist(admin);

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
