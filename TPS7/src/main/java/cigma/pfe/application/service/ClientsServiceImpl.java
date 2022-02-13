package cigma.pfe.application.service;

import cigma.pfe.application.dao.IClientsDao;
import cigma.pfe.application.model.Clients;
import lombok.Data;

@Data
public class ClientsServiceImpl  implements IClientsService{
	
	IClientsDao  iclientsDao;

	public ClientsServiceImpl(IClientsDao icommandDao) {
		this.iclientsDao = icommandDao;
	}

	public ClientsServiceImpl() {
		
	}

	@Override
	public void save(Clients c) {
		
		iclientsDao.save(c);
	}

	@Override
	public Clients update(Clients c) {
		return iclientsDao.update(c);
	}

	@Override
	public void delete(Clients c) {
		iclientsDao.delete(c);
		
	}

	@Override
	public Clients findById(int idClients) {
		// TODO Auto-generated method stub
		return iclientsDao.findById(idClients);
	}
	
	

}
