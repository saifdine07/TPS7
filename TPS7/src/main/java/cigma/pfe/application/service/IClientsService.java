package cigma.pfe.application.service;

import cigma.pfe.application.model.Clients;

public interface IClientsService {
	
	public void save(Clients c);
	public Clients update(Clients c);
	public void delete(Clients c);
	public Clients findById(int idClients);

}
