package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface ICarDAO {
	public void saveCar(Car car);
	public void updateCar(Car car);
	public Car getCarById(Integer car_id);
	public Integer getAllCarsCount();
	public Collection<Car> getAllCars();
	public void deleteCar(Car car);
}
