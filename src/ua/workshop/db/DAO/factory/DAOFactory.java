package ua.workshop.db.DAO.factory;

import ua.workshop.db.DAO.*;
import ua.workshop.db.DAO.impl.*;

public class DAOFactory {
	
	private static DAOFactory _instance = null;

	private ICarDAO carDAO = null;
	private IClientDAO clientDAO = null;
	private IColorOfCarDAO colorOfCarDAO = null;
	private IDetailDAO detailDAO = null;
	private IMarkOfCarDAO markOfCarDAO = null;
	private IModelOfCarDAO modelOfCarDAO = null;
	private IOperationDAO operationDAO = null;
	private IOrderDAO orderDAO = null;
	private IProcessDAO processDAO = null;
	private IProcessHasDetailDAO processHasDetailDAO = null;
	private IStandartDetailDAO standartDetailDAO = null;
	private IWorkerDAO workerDAO = null;
	
	private DAOFactory(){
		
	}
	
	public static DAOFactory getInstance(){
		if(_instance == null)
			_instance = new DAOFactory();
		
		return _instance;
	}

	public ICarDAO getCarDAO() {
		if(carDAO == null)
			carDAO = new CarDAOImpl();
		return carDAO;
	}

	public IClientDAO getClientDAO() {
		if(clientDAO == null)
			clientDAO = new ClientDAOImpl();
		return clientDAO;
	}

	public IColorOfCarDAO getColorOfCarDAO() {
		if(colorOfCarDAO == null)
			colorOfCarDAO = new ColorOfCarDAOImpl();
		return colorOfCarDAO;
	}

	public IDetailDAO getDetailDAO() {
		if(detailDAO == null)
			detailDAO = new DetailDAOImpl();
		return detailDAO;
	}

	public IMarkOfCarDAO getMarkOfCarDAO() {
		if(markOfCarDAO == null)
			markOfCarDAO = new MarkOfCarDAOImpl();
		return markOfCarDAO;
	}

	public IModelOfCarDAO getModelOfCarDAO() {
		if(modelOfCarDAO == null)
			modelOfCarDAO = new ModelOfCarDAOImpl();
		return modelOfCarDAO;
	}

	public IOperationDAO getOperationDAO() {
		if(operationDAO == null)
			operationDAO = new OperationDAOImpl();
		return operationDAO;
	}

	public IOrderDAO getOrderDAO() {
		if(orderDAO == null)
			orderDAO = new OrderDAOImpl();
		return orderDAO;
	}

	public IProcessDAO getProcessDAO() {
		if(processDAO == null)
			processDAO = new ProcessDAOImpl();
		return processDAO;
	}

	public IProcessHasDetailDAO getProcessHasDetailDAO() {
		if(processHasDetailDAO == null)
			processHasDetailDAO = new ProcessHasDetailDAOImpl();
		return processHasDetailDAO;
	}

	public IStandartDetailDAO getStandartDetailDAO() {
		if(standartDetailDAO == null)
			standartDetailDAO = new StandartDetailDAOImpl();
		return standartDetailDAO;
	}

	public IWorkerDAO getWorkerDAO() {
		if(workerDAO == null)
			workerDAO = new WorkerDAOImpl();
		return workerDAO;
	}
}
