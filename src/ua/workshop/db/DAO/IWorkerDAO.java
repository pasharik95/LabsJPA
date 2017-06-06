package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IWorkerDAO {
	public void saveWorker(Worker Worker);
	public void updateWorker(Worker Worker);
	public Worker getWorkerById(Integer Worker_id);
	public Integer getAllWorkersCount();
	public Collection<Worker> getAllWorkers();
	public void deleteWorker(Worker Worker);
}
