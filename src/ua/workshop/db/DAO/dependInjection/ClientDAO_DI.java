package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IClientDAO;
import ua.workshop.db.jpa.Client;

public class ClientDAO_DI {

	private IClientDAO clientDAO;
	
	public ClientDAO_DI(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

    
	public void saveClient(Client client) {
		clientDAO.saveClient(client);
	}

	public void updateClient(Client client) {
		clientDAO.updateClient(client);
	}

	public void deleteClient(Client client) {
		clientDAO.deleteClient(client);
	}

	public Client getClientById(Integer client_id) {
		Client client = clientDAO.getClientById(client_id);
		return client;
	}

	public Integer getAllClientCount() {
		Integer cnt = clientDAO.getAllClientsCount();
		return cnt;
	}

	public Collection<Client> getAllClients() {
		List<Client> clients = (List<Client>) clientDAO.getAllClients();
		return clients;
	}


}
