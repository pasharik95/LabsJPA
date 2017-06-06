package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IModelOfCarDAO;
import ua.workshop.db.jpa.ModelOfCar;

public class ModelOfCarDAO_DI {

	private IModelOfCarDAO modelOfCarDAO;
	
	public ModelOfCarDAO_DI(IModelOfCarDAO modelOfCarDAO) {
		this.modelOfCarDAO = modelOfCarDAO;
	}

    
	public void saveModelOfCar(ModelOfCar modelOfCar) {
		modelOfCarDAO.saveModelOfCar(modelOfCar);
	}

	public void updateModelOfCar(ModelOfCar modelOfCar) {
		modelOfCarDAO.updateModelOfCar(modelOfCar);
	}

	public void deleteModelOfCar(ModelOfCar modelOfCar) {
		modelOfCarDAO.deleteModelOfCar(modelOfCar);
	}

	public ModelOfCar getModelOfCarById(Integer modelOfCar_id) {
		ModelOfCar modelOfCar = modelOfCarDAO.getModelOfCarById(modelOfCar_id);
		return modelOfCar;
	}

	public Integer getAllModelOfCarCount() {
		Integer cnt = modelOfCarDAO.getAllModelOfCarsCount();
		return cnt;
	}

	public Collection<ModelOfCar> getAllModelOfCars() {
		List<ModelOfCar> modelOfCars = (List<ModelOfCar>) modelOfCarDAO.getAllModelOfCars();
		return modelOfCars;
	}


}
