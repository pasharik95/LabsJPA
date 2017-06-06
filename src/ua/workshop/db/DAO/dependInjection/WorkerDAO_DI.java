package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IWorkerDAO;
import ua.workshop.db.jpa.Worker;

public class WorkerDAO_DI {

	private IWorkerDAO workerDAO;
	
	public WorkerDAO_DI(IWorkerDAO workerDAO) {
		this.workerDAO = workerDAO;
	}

    
	public void saveWorker(Worker worker) {
		workerDAO.saveWorker(worker);
	}

	public void updateWorker(Worker worker) {
		workerDAO.updateWorker(worker);
	}

	public void deleteWorker(Worker worker) {
		workerDAO.deleteWorker(worker);
	}

	public Worker getWorkerById(Integer worker_id) {
		Worker worker = workerDAO.getWorkerById(worker_id);
		return worker;
	}

	public Integer getAllWorkerCount() {
		Integer cnt = workerDAO.getAllWorkersCount();
		return cnt;
	}

	public Collection<Worker> getAllWorkers() {
		List<Worker> workers = (List<Worker>) workerDAO.getAllWorkers();
		return workers;
	}


}
