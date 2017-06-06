package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IMarkOfCarDAO {
	public void saveMarkOfCar(MarkOfCar MarkOfCar);
	public void updateMarkOfCar(MarkOfCar MarkOfCar);
	public MarkOfCar getMarkOfCarById(Integer MarkOfCar_id);
	public Integer getAllMarkOfCarsCount();
	public Collection<MarkOfCar> getAllMarkOfCars();
	public void deleteMarkOfCar(MarkOfCar MarkOfCar);
}
