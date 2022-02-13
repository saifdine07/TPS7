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

	@Override
	public Clients update(Clients c) {
		em.getTransaction().begin();
		Clients cltupd = em.find(Clients.class, c.getId());
		cltupd.setName(c.getName());
		em.persist(cltupd);
		em.getTransaction().commit();
		System.out.println("modification ");
		
		return null;
	}

	@Override
	public void delete(Clients c) {
		em.getTransaction().begin();
		Clients cltdlt = em.find(Clients.class, c.getId());
		em.remove(cltdlt);
		em.getTransaction().commit();
		
	}

	@Override
	public Clients findById(int idClients) {
		em.getTransaction().begin();
		Clients cltfnd = em.find(Clients.class, idClients);
		 em.getTransaction().commit();
		 System.out.println("(Client -->)l'id : " + cltfnd.getId()+ ", name : " + cltfnd.getName());
		return cltfnd;
		
	}

}
