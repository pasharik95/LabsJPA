package ua.workshop.db.DAO.impl;

import ua.workshop.db.DAO.IStandartDetailDAO;
import ua.workshop.db.jpa.StandartDetail;


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
public class StandartDetailDAOImpl implements IStandartDetailDAO {

	private static final String PERSISTENCE_UNIT_NAME = "LabsJPA";
	private EntityManagerFactory entityMF = null;
	private EntityManager entityMng = null;

	public StandartDetailDAOImpl() {
		entityMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@Override
	public void saveStandartDetail(StandartDetail StandartDetail) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.persist(StandartDetail); // Сохранение экземпляра класса
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
	public void updateStandartDetail(StandartDetail StandartDetail) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.merge(StandartDetail);
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
	public StandartDetail getStandartDetailById(Integer StandartDetail_id) {
		StandartDetail StandartDetail = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			StandartDetail = entityMng.find(StandartDetail.class, StandartDetail_id);
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'findById'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return StandartDetail;
	}

	@Override
	public Integer getAllStandartDetailsCount() {
		Integer cnt = null;
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT COUNT c FROM StandartDetail c");
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
	public Collection<StandartDetail> getAllStandartDetails() {
		List<StandartDetail> StandartDetails = null; 
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			Query query = entityMng.createQuery("SELECT c from StandartDetail c");
			StandartDetails = (List<StandartDetail>)query.getResultList();
			entityMng.getTransaction().commit();
		} catch (Exception e) {
			new Exception("Помилка 'getAll'", e.getCause());
		} finally {
			if (entityMng != null && entityMng.isOpen()) {
				entityMng.close();
			}
		}

		return StandartDetails;
	}

	@Override
	public void deleteStandartDetail(StandartDetail StandartDetail) {
		try {
			entityMng = entityMF.createEntityManager();
			entityMng.getTransaction().begin();
			entityMng.remove(StandartDetail);
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