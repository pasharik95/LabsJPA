package ua.workshop.db.DAO.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ua.workshop.db.DAO.IGenericDAO;

/**
 * ���������� ����� ������� ��� ���� ��������� 
 * � ���������� IGenericDAO
 * @param <T>
 */
public class GenericDAOImpl<T> implements IGenericDAO<T> {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	/** 
	 * �������� ������ Class<T> persistentClass. ��� ������ ������������ 
	 * ��� �������� �� ���������� �����, ������������ � �������� ��������� T
	 */
	protected Class<T> persistentClass;

	/**
	 * � ������ ������� ��� ����������� �������������� ������� %s, 
	 * ������� �������������� � ������� String.format  
	 */
	//������� ������������� � ������� String.format
	private static final String QUERY_SELECT_ALL = "SELECT x FROM %s x";
	private static final String QUERY_COUNT_ALL = "SELECT COUNT(x) FROM %s x";

	/**
	 * EntityManagerFactory ��������� � DAOFactory � ���������� ������ 
	 * ����� �������� ������������.
	 * ����������� � 2-�� ������
	 * �����, ������� ����� ������������ ���� DAO  
	 * @param persistentClass ������������ EntityManager
	 * @param emf	
	 */			
	public GenericDAOImpl (Class<T> persistentClass, EntityManagerFactory emf) {
		super(); 				// ��� super ����������� ???
		this.persistentClass = persistentClass;	
		this.emf = emf;			// ������� EntityManager ��� ������ � ���������� ������
	}

	public void save(T entity) {
		if (entity == null) {
			System.out.println("Entity ��� ���������� �� ����� ���� null!");
		}
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(entity); // ���������� ���������� ������
			// ��������� ������ � �� ����� � � ������� JPQL	
			em.getTransaction().commit();	 		
		} catch (Exception e) {
			System.out.println("������ ����������");
			em.getTransaction().rollback();
		} finally {		
			//������� �������� ������� entity manager
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
	}	  

	public void update(T entity) {		 
		if (entity == null) {
			System.out.println("Entity ��� ���������� �� ����� ���� null!");
		}	 
		try {
			em = emf.createEntityManager();
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(entity); // ���������� �������� � ��
			// �������� ������ � �� ����� � � ������� JPQL		    	 
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("������ ��� �������");    
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
	}

	public void delete(T entity) {	 
		if (entity == null) {
			System.out.println("Entity ��� �������� �� ����� ���� null!");
		}
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("������ ��� ��������");
			em.getTransaction().rollback();
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
	}

	public void delete(Integer entityId) {
		delete(getById(entityId));
	}

	public T getById(Integer entityId) {
		T entity = null;
		if (entityId == null) {
			System.out.println("Id �������� ��� ���������� null!");
		}		 
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();	    	 
			entity = (T) em.find(persistentClass, entityId);
		} catch (Exception e) {
			System.out.println("������ 'findById'");
			em.getTransaction().rollback();  
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
		return entity;
	}

	public Integer getAllCount() {		
		Integer cnt = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createQuery(String.format(QUERY_COUNT_ALL, persistentClass.getSimpleName()));
			cnt =  (Integer) query.getSingleResult();
			em.getTransaction().commit(); 
		}	catch (Exception e) {
			System.out.println("������ getAllCount");   
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
		return cnt;
	}		

	public Collection<T> getAll() {
		List<T> entites = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createQuery(String.format(QUERY_SELECT_ALL, persistentClass.getSimpleName()));
			entites = (List<T>) query.getResultList();
			em.getTransaction().commit();    	 
		} catch (Exception e) {
			System.out.println("������ 'getAll'");   
		} finally {
			if (em != null && em.isOpen()) {
				em.close();
			}
		}
		return entites;
	}
}