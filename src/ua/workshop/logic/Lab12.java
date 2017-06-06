package ua.workshop.logic;

import java.util.List;

import ua.workshop.db.DAO.factory.DAOFactory;
import ua.workshop.db.jpa.*;

public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������i ���������� ���i�������:");

		List<Worker> workers = (List<Worker>) DAOFactory.getInstance().getWorkerDAO().getAllWorkers();
		
		for(Worker worker : workers){
			System.out.println("������� : " + worker.toString());
			
			if(worker.getOrders().size() == 0 )
				System.out.println("- ��� ������");
				
			for(Order o : worker.getOrders()){
				System.out.println("- " + o.getCar().toString());
			}
		}

	}

}
