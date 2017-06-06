package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IClientDAO {
	public void saveClient(Client Client);
	public void updateClient(Client Client);
	public Client getClientById(Integer Client_id);
	public Integer getAllClientsCount();
	public Collection<Client> getAllClients();
	public void deleteClient(Client Client);
}
