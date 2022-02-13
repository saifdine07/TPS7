package cigma.pfe.application.dao;

import cigma.pfe.application.model.Clients;

public interface IClientsDao {

	public void save(Clients c);
	public Clients update(Clients c);
	public void delete(Clients c);
	public Clients findById(int idClients);
}
