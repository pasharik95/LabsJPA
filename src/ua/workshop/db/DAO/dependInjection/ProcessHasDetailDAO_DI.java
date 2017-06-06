package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IProcessHasDetailDAO;
import ua.workshop.db.jpa.ProcessHasDetail;

public class ProcessHasDetailDAO_DI {

	private IProcessHasDetailDAO processHasDetailDAO;
	
	public ProcessHasDetailDAO_DI(IProcessHasDetailDAO processHasDetailDAO) {
		this.processHasDetailDAO = processHasDetailDAO;
	}

    
	public void saveProcessHasDetail(ProcessHasDetail processHasDetail) {
		processHasDetailDAO.saveProcessHasDetail(processHasDetail);
	}

	public void updateProcessHasDetail(ProcessHasDetail processHasDetail) {
		processHasDetailDAO.updateProcessHasDetail(processHasDetail);
	}

	public void deleteProcessHasDetail(ProcessHasDetail processHasDetail) {
		processHasDetailDAO.deleteProcessHasDetail(processHasDetail);
	}

	public ProcessHasDetail getProcessHasDetailById(Integer processHasDetail_id) {
		ProcessHasDetail processHasDetail = processHasDetailDAO.getProcessHasDetailById(processHasDetail_id);
		return processHasDetail;
	}

	public Integer getAllProcessHasDetailCount() {
		Integer cnt = processHasDetailDAO.getAllProcessHasDetailsCount();
		return cnt;
	}

	public Collection<ProcessHasDetail> getAllProcessHasDetails() {
		List<ProcessHasDetail> processHasDetails = (List<ProcessHasDetail>) processHasDetailDAO.getAllProcessHasDetails();
		return processHasDetails;
	}


}
