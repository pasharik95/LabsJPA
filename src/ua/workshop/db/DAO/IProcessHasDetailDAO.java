package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IProcessHasDetailDAO {
	public void saveProcessHasDetail(ProcessHasDetail ProcessHasDetail);
	public void updateProcessHasDetail(ProcessHasDetail ProcessHasDetail);
	public ProcessHasDetail getProcessHasDetailById(Integer ProcessHasDetail_id);
	public Integer getAllProcessHasDetailsCount();
	public Collection<ProcessHasDetail> getAllProcessHasDetails();
	public void deleteProcessHasDetail(ProcessHasDetail ProcessHasDetail);
}
