package ua.workshop.db.DAO;

import java.util.Collection;

public interface IProcessDAO {
	public void saveProcess(ua.workshop.db.jpa.Process Process);
	public void updateProcess(ua.workshop.db.jpa.Process Process);
	public ua.workshop.db.jpa.Process getProcessById(Integer Process_id);
	public Integer getAllProcessesCount();
	public Collection<ua.workshop.db.jpa.Process> getAllProcesses();
	public void deleteProcess(ua.workshop.db.jpa.Process Process);
}
