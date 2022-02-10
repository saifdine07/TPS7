package cigma.pfe.application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.application.model.Clients;

public class ClientsDaoImpl implements IClientsDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em = emf.createEntityManager();

	@Override
	public void save(Clients c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

}
