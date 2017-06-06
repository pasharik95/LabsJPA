package ua.workshop.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Persistence;
import ua.workshop.db.DAO.IGenericDAO;
import ua.workshop.db.DAO.impl.GenericDAOImpl;
import ua.workshop.db.entity.StandartDetail;
import ua.workshop.db.jpa.Car;
import ua.workshop.db.jpa.Client;
import ua.workshop.db.jpa.Operation;
import ua.workshop.db.jpa.Order;
import ua.workshop.db.jpa.Worker;


public class Lab15 {
	
	private static final String PERSISTENCE_UNIT_NAME = "LabsJPA";
	public static void main(String[] args) {
		// ����������� �� � �������� ����� JPA
		
		/*try{
			System.out.println((new Date()) + ": ������� ��������� ��!");
			Persistence.generateSchema(PERSISTENCE_UNIT_NAME, null);
			System.out.println((new Date()) + ": �� ����������� ���i���!");
		}
		catch(Exception ex){
			System.err.println((new Date()) + ": �������: " + ex.getMessage());
		}*/
				
				
				
				/*List<String> details = new ArrayList<>();
				details.add("������, �������");
				details.add("����, ������ ��");
				details.add("������");
				
				IGenericDAO<StandartDetail> genericDAO = new GenericDAOImpl<StandartDetail>(StandartDetail.class, 
						Persistence.createEntityManagerFactory("LabsJPA"));
				Integer i = 0;
				for(String strDetail : details) {
					StandartDetail currentDetail = new StandartDetail(i++, strDetail, null);
					genericDAO.save(currentDetail);
				}*/

				
				List<String> operations = new ArrayList<>();
				operations.add("��������");
				operations.add("����������");
				operations.add("���������");
				
				IGenericDAO<Operation> genericDAO = new GenericDAOImpl<Operation>(Operation.class, 
						Persistence.createEntityManagerFactory("LabsJPA"));
				
				/*for(String strOpers : operations) {
					Operation currentOperation = new Operation();
					currentOperation.setNameOperation(strOpers);
					genericDAO.save(currentOperation);
				}*/
				
				Integer i = 0;
				for(Operation operation : genericDAO.getAll()) {;
					operation.setDuration(i++);
					genericDAO.update(operation);;
				}
				
				/*
				Operation operation = genericDAO.getById(1);
				genericDAO.delete(operation);*/
				
				

	}

}
