package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.ICarDAO;
import ua.workshop.db.jpa.Car;

public class CarDAO_DI {

	private ICarDAO carDAO;
	
	public CarDAO_DI(ICarDAO carDAO) {
		this.carDAO = carDAO;
	}

    
	public void saveCar(Car car) {
		carDAO.saveCar(car);
	}

	public void updateCar(Car car) {
		carDAO.updateCar(car);
	}

	public void deleteCar(Car car) {
		carDAO.deleteCar(car);
	}

	public Car getCarById(Integer car_id) {
		Car car = carDAO.getCarById(car_id);
		return car;
	}

	public Integer getAllCarCount() {
		Integer cnt = carDAO.getAllCarsCount();
		return cnt;
	}

	public Collection<Car> getAllCar() {
		List<Car> cars = (List<Car>) carDAO.getAllCars();
		return cars;
	}


}
