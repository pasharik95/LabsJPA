package ua.workshop.db.entity;

public class ColorOfCar {
	private int id;
	private String nameColorOfCar;
	
	public ColorOfCar(int id, String nameColorOfCar){
		setId(id);
		setNameColorOfCar(nameColorOfCar);
	}
	public String getNameColorOfCar() {
		return nameColorOfCar;
	}
	public void setNameColorOfCar(String nameColorOfCar) {
		this.nameColorOfCar = nameColorOfCar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
