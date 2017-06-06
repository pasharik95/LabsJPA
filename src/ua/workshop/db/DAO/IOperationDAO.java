package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IOperationDAO {
	public void saveOperation(Operation Operation);
	public void updateOperation(Operation Operation);
	public Operation getOperationById(Integer Operation_id);
	public Integer getAllOperationsCount();
	public Collection<Operation> getAllOperations();
	public void deleteOperation(Operation Operation);
}
