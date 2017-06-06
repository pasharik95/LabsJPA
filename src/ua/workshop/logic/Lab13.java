package ua.workshop.logic;

import java.util.List;

import ua.workshop.db.DAO.dependInjection.ClientDAO_DI;
import ua.workshop.db.DAO.factory.DAOFactory;
import ua.workshop.db.DAO.impl.ClientDAOImpl;
import ua.workshop.db.jpa.*;

public class Lab13 {

	public static void main(String[] args) {
		
		ClientDAO_DI diClient = new ClientDAO_DI(new ClientDAOImpl());
		System.out.println("Всі клієнти:");
		for(Client client : diClient.getAllClients()){
			System.out.println(client);
			for(Car car : client.getCars()){
				System.out.println(" - " + car);
			}
		}

		System.out.println("*********************");
		System.out.println("Прийнятi замовлення робiтниками:");
		List<Worker> workers = (List<Worker>) DAOFactory.getInstance().getWorkerDAO().getAllWorkers();
		
		for(Worker worker : workers){
			System.out.println("Робітник : " + worker.toString());
			
			if(worker.getOrders().size() == 0 )
				System.out.println("- Дані відсутні");
				
			for(Order o : worker.getOrders()){
				System.out.println("- " + o.getCar().toString());
			}
		}
	}
}
