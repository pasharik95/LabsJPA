package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IColorOfCarDAO;
import ua.workshop.db.jpa.ColorOfCar;

public class ColorOfCarDAO_DI {

	private IColorOfCarDAO colorOfCarDAO;
	
	public ColorOfCarDAO_DI(IColorOfCarDAO colorOfCarDAO) {
		this.colorOfCarDAO = colorOfCarDAO;
	}

    
	public void saveColorOfCar(ColorOfCar colorOfCar) {
		colorOfCarDAO.saveColorOfCar(colorOfCar);
	}

	public void updateColorOfCar(ColorOfCar colorOfCar) {
		colorOfCarDAO.updateColorOfCar(colorOfCar);
	}

	public void deleteColorOfCar(ColorOfCar colorOfCar) {
		colorOfCarDAO.deleteColorOfCar(colorOfCar);
	}

	public ColorOfCar getColorOfCarById(Integer colorOfCar_id) {
		ColorOfCar colorOfCar = colorOfCarDAO.getColorOfCarById(colorOfCar_id);
		return colorOfCar;
	}

	public Integer getAllColorOfCarCount() {
		Integer cnt = colorOfCarDAO.getAllColorOfCarsCount();
		return cnt;
	}

	public Collection<ColorOfCar> getAllColorOfCars() {
		List<ColorOfCar> colorOfCars = (List<ColorOfCar>) colorOfCarDAO.getAllColorOfCars();
		return colorOfCars;
	}


}
