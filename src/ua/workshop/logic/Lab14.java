package ua.workshop.logic;


import javax.persistence.Persistence;
import ua.workshop.db.DAO.IGenericDAO;
import ua.workshop.db.DAO.impl.GenericDAOImpl;
import ua.workshop.db.jpa.Car;
import ua.workshop.db.jpa.Client;
import ua.workshop.db.jpa.Order;
import ua.workshop.db.jpa.Worker;

public class Lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGenericDAO<Client> clientsDAO = new GenericDAOImpl<Client>(Client.class, 
				Persistence.createEntityManagerFactory("LabsJPA"));
		IGenericDAO<Worker> workersDAO = new GenericDAOImpl<Worker>(Worker.class, 
				Persistence.createEntityManagerFactory("LabsJPA"));
		System.out.println("�� �볺���:");
		for(Client client : clientsDAO.getAll()){
			System.out.println(client);
			for(Car car : client.getCars()){
				System.out.println(" -- " + car);
			}
		}

		System.out.println("*********************");
		System.out.println("�������i ���������� ���i�������:");
		
		for(Worker worker : workersDAO.getAll()){
			System.out.println("������� : " + worker.toString());
			
			if(worker.getOrders().size() == 0 )
				System.out.println("- ��� ������");
				
			for(Order o : worker.getOrders()){
				System.out.println("- " + o.getCar().toString());
			}
		}
	}

}
