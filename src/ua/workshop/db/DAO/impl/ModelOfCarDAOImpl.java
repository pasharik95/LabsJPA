package ua.workshop.db.DAO.impl;

import ua.workshop.db.DAO.IModelOfCarDAO;
import ua.workshop.db.jpa.ModelOfCar;


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
public class ModelOfCarDAOImpl implements IModelOfCarDAO {

	private static final String PERSISTENCE_UNIT_NAME = "LabsJPA";
	private EntityManagerFactory entityMF = null;
	private EntityManager entityMng = null;

	public ModelOfCarDAOImpl() {
		entityMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@Override
	public void saveModelOfCar(ModelOfCar ModelOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.persist(ModelOfCar); // Сохранение экземпляра класса
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
	public void updateModelOfCar(ModelOfCar ModelOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.merge(ModelOfCar);
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
	public ModelOfCar getModelOfCarById(Integer ModelOfCar_id) {
		ModelOfCar ModelOfCar = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			ModelOfCar = entityMng.find(ModelOfCar.class, ModelOfCar_id);
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'findById'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return ModelOfCar;
	}

	@Override
	public Integer getAllModelOfCarsCount() {
		Integer cnt = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT COUNT c FROM ModelOfCar c");
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
	public Collection<ModelOfCar> getAllModelOfCars() {
		List<ModelOfCar> ModelOfCars = null; 
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT c from ModelOfCar c");
			ModelOfCars = (List<ModelOfCar>)query.getResultList();
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'getAll'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return ModelOfCars;
	}

	@Override
	public void deleteModelOfCar(ModelOfCar ModelOfCar) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.remove(ModelOfCar);
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