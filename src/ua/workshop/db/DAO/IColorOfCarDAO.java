package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IColorOfCarDAO {
	public void saveColorOfCar(ColorOfCar ColorOfCar);
	public void updateColorOfCar(ColorOfCar ColorOfCar);
	public ColorOfCar getColorOfCarById(Integer ColorOfCar_id);
	public Integer getAllColorOfCarsCount();
	public Collection<ColorOfCar> getAllColorOfCars();
	public void deleteColorOfCar(ColorOfCar ColorOfCar);
}
