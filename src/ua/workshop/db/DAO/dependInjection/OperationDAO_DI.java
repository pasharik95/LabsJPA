package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IOperationDAO;
import ua.workshop.db.jpa.Operation;

public class OperationDAO_DI {

	private IOperationDAO operationDAO;
	
	public OperationDAO_DI(IOperationDAO operationDAO) {
		this.operationDAO = operationDAO;
	}

    
	public void saveOperation(Operation operation) {
		operationDAO.saveOperation(operation);
	}

	public void updateOperation(Operation operation) {
		operationDAO.updateOperation(operation);
	}

	public void deleteOperation(Operation operation) {
		operationDAO.deleteOperation(operation);
	}

	public Operation getOperationById(Integer operation_id) {
		Operation operation = operationDAO.getOperationById(operation_id);
		return operation;
	}

	public Integer getAllOperationCount() {
		Integer cnt = operationDAO.getAllOperationsCount();
		return cnt;
	}

	public Collection<Operation> getAllOperations() {
		List<Operation> operations = (List<Operation>) operationDAO.getAllOperations();
		return operations;
	}


}
