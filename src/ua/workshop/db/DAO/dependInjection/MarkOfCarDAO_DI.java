package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IMarkOfCarDAO;
import ua.workshop.db.jpa.MarkOfCar;

public class MarkOfCarDAO_DI {

	private IMarkOfCarDAO markOfCarDAO;
	
	public MarkOfCarDAO_DI(IMarkOfCarDAO markOfCarDAO) {
		this.markOfCarDAO = markOfCarDAO;
	}

    
	public void saveMarkOfCar(MarkOfCar markOfCar) {
		markOfCarDAO.saveMarkOfCar(markOfCar);
	}

	public void updateMarkOfCar(MarkOfCar markOfCar) {
		markOfCarDAO.updateMarkOfCar(markOfCar);
	}

	public void deleteMarkOfCar(MarkOfCar markOfCar) {
		markOfCarDAO.deleteMarkOfCar(markOfCar);
	}

	public MarkOfCar getMarkOfCarById(Integer markOfCar_id) {
		MarkOfCar markOfCar = markOfCarDAO.getMarkOfCarById(markOfCar_id);
		return markOfCar;
	}

	public Integer getAllMarkOfCarCount() {
		Integer cnt = markOfCarDAO.getAllMarkOfCarsCount();
		return cnt;
	}

	public Collection<MarkOfCar> getAllMarkOfCars() {
		List<MarkOfCar> markOfCars = (List<MarkOfCar>) markOfCarDAO.getAllMarkOfCars();
		return markOfCars;
	}


}
