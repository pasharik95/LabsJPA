package ua.workshop.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.workshop.db.jpa.Car;
import ua.workshop.db.jpa.Order;
import ua.workshop.db.jpa.Worker;

public class Lab11 {

	private static final String PERSISTENCE_UNIT_NAME = "LabsJPA";
    private static EntityManagerFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteOrder(AddNewOrder());
		EditCar(1, 1000);
		/**/
	}
	public static int AddNewOrder(){
        System.out.println("===��������� ������ ����������===");
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		// �������� �������� ���������
		Car car = (Car) em.find(Car.class, 2);
		Worker worker = (Worker) em.find(Worker.class, 1);
		System.out.println("�������, ���� ����������� ���������� : " + worker.toString());
		System.out.println("���������    : " + car.toString());

		// �������� ����������
        Order order = new Order();
        order.setDateTime(new Date());		// ���������� ���� ���������
        order.setCar(car);
        order.setWorker(worker);
        order.setStatus(false);
        order.setProcesses(null);
        
		// ��������� �� ��
		em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        em.close();
        System.out.println("===�������� ����������===");
        
        return order.getId();
	}
	// ��������� ������� ��������� �� ���
		public static void EditCar(int id, int distance){
			System.out.println("===����������� ===");
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = factory.createEntityManager();
			
			// �������� ����������
			Car car = (Car) em.find(Car.class, id);
			
			// ����������� ���������� ��� ���������
			System.out.println(car);
			
			// ������ ���������� ��� ���������
	        System.out.println("����������: ");
			em.getTransaction().begin();
			car.setDistance(distance);
	        em.getTransaction().commit();
	        em.close();
			System.out.println("===³�����������===");
		}
		public static void DeleteOrder(int id){
			System.out.println("===��������� ����������===");
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = factory.createEntityManager();
			
			// �������� ����������
			Order order = (Order) em.find(Order.class, id);
			
			// ����������� ����������
			System.out.println(order);
			
			// �������� ����������
			em.getTransaction().begin();
			em.remove(order);
	        em.getTransaction().commit();
	        em.close();
			System.out.println("===��������===");
		}

}
