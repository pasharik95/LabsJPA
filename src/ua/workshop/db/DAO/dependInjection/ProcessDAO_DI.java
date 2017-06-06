package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IProcessDAO;
import ua.workshop.db.jpa.Process;

public class ProcessDAO_DI {

	private IProcessDAO processDAO;
	
	public ProcessDAO_DI(IProcessDAO processDAO) {
		this.processDAO = processDAO;
	}

    
	public void saveProcess(Process process) {
		processDAO.saveProcess(process);
	}

	public void updateProcess(Process process) {
		processDAO.updateProcess(process);
	}

	public void deleteProcess(Process process) {
		processDAO.deleteProcess(process);
	}

	public Process getProcessById(Integer process_id) {
		Process process = processDAO.getProcessById(process_id);
		return process;
	}

	public Integer getAllProcessCount() {
		Integer cnt = processDAO.getAllProcessesCount();
		return cnt;
	}

	public Collection<Process> getAllProcesss() {
		List<Process> processs = (List<Process>) processDAO.getAllProcesses();
		return processs;
	}


}
