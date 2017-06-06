package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IModelOfCarDAO {
	public void saveModelOfCar(ModelOfCar ModelOfCar);
	public void updateModelOfCar(ModelOfCar ModelOfCar);
	public ModelOfCar getModelOfCarById(Integer ModelOfCar_id);
	public Integer getAllModelOfCarsCount();
	public Collection<ModelOfCar> getAllModelOfCars();
	public void deleteModelOfCar(ModelOfCar ModelOfCar);
}
