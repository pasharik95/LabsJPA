package ua.workshop.db.DAO.impl;

import ua.workshop.db.DAO.IMarkOfCarDAO;
import ua.workshop.db.jpa.MarkOfCar;


import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author pasha
 * @since 0.12
 */
public class MarkOfCarDAOImpl implements IMarkOfCarDAO {

	private static final String PERSISTENCE_UNIT_NAME = "LabsJPA";
	private EntityManagerFactory entityMF = null;
	private EntityManager entityMng = null;

	public MarkOfCarDAOImpl() {
		entityMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@Override
	public void saveMarkOfCar(MarkOfCar MarkOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.persist(MarkOfCar); // Сохранение экземпляра класса
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка при збереженні!", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}
	}

	@Override
	public void updateMarkOfCar(MarkOfCar MarkOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.merge(MarkOfCar);
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка при оновленні!", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}
	}

	@Override
	public MarkOfCar getMarkOfCarById(Integer MarkOfCar_id) {
		MarkOfCar MarkOfCar = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			MarkOfCar = entityMng.find(MarkOfCar.class, MarkOfCar_id);
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'findById'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return MarkOfCar;
	}

	@Override
	public Integer getAllMarkOfCarsCount() {
		Integer cnt = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT COUNT c FROM MarkOfCar c");
			cnt = (Integer) query.getSingleResult();
			entityMng.getTransaction().commit(); 
		} catch (Exception e) {
			new Exception("Помилка ", e.getCause());    
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return cnt;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<MarkOfCar> getAllMarkOfCars() {
		List<MarkOfCar> MarkOfCars = null; 
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT c from MarkOfCar c");
			MarkOfCars = (List<MarkOfCar>)query.getResultList();
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'getAll'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return MarkOfCars;
	}

	@Override
	public void deleteMarkOfCar(MarkOfCar MarkOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.remove(MarkOfCar);
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка при видаленні!", e.getCause());     
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}
	}

}