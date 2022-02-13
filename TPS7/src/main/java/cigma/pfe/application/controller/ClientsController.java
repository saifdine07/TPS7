package cigma.pfe.application.controller;

import cigma.pfe.application.model.Clients;
import cigma.pfe.application.service.IClientsService;
import lombok.Data;

@Data
public class ClientsController {
	
	IClientsService iclientsService;
	
	
	public void save(Clients c) {
		iclientsService.save(c);
	}
	
	public Clients update(Clients c) {
		return iclientsService.update(c);
		
	}
	
	public void delete(Clients c) {
		iclientsService.delete(c);
	}
	
	public Clients findById(int idClients) {
		return iclientsService.findById(idClients);
		
	}
	
	public ClientsController(IClientsService icommandService) {
		this.iclientsService = icommandService;
	}

	public ClientsController() {
		
	}
	
	

}
