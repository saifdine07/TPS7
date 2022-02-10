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
	
	
	public ClientsController(IClientsService icommandService) {
		this.iclientsService = icommandService;
	}

	public ClientsController() {
		
	}
	
	

}
