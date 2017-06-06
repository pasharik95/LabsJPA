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
        System.out.println("===СТВОРЕННЯ НОВОГО ЗАМОВЛЕННЯ===");
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		// Отримаємо існуючий автомобіль
		Car car = (Car) em.find(Car.class, 2);
		Worker worker = (Worker) em.find(Worker.class, 1);
		System.out.println("Робітник, який зареєстрував замовлення : " + worker.toString());
		System.out.println("Автомобіль    : " + car.toString());

		// Створимо замовлення
        Order order = new Order();
        order.setDateTime(new Date());		// Встановити дату виконання
        order.setCar(car);
        order.setWorker(worker);
        order.setStatus(false);
        order.setProcesses(null);
        
		// Збережемо до БД
		em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        em.close();
        System.out.println("===Створено Замовлення===");
        
        return order.getId();
	}
	// Помножити кількість продукції на два
		public static void EditCar(int id, int distance){
			System.out.println("===Редагування ===");
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = factory.createEntityManager();
			
			// Отримаємо замовлення
			Car car = (Car) em.find(Car.class, id);
			
			// Переглянемо інформацію про автомобіль
			System.out.println(car);
			
			// Змінимо інформацію про автомобіль
	        System.out.println("Замовлення: ");
			em.getTransaction().begin();
			car.setDistance(distance);
	        em.getTransaction().commit();
	        em.close();
			System.out.println("===Відредаговано===");
		}
		public static void DeleteOrder(int id){
			System.out.println("===Видалення замовлення===");
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = factory.createEntityManager();
			
			// Отримаємо замовлення
			Order order = (Order) em.find(Order.class, id);
			
			// Переглянемо замовлення
			System.out.println(order);
			
			// Видалемо замовлення
			em.getTransaction().begin();
			em.remove(order);
	        em.getTransaction().commit();
	        em.close();
			System.out.println("===Видалено===");
		}

}
