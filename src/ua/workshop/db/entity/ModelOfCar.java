package ua.workshop.db.entity;

public class ModelOfCar {
	private int id;
	private String nameModelOfCar;
	private MarkOfCar mark;
	
	public ModelOfCar(int id, String nameModelOfCar, MarkOfCar mark){
		setId(id);
		setNameModelOfCar(nameModelOfCar);
		setMark(mark);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameModelOfCar() {
		return nameModelOfCar;
	}
	public void setNameModelOfCar(String nameModelOfCar) {
		this.nameModelOfCar = nameModelOfCar;
	}
	public MarkOfCar getMark() {
		return mark;
	}
	public void setMark(MarkOfCar mark) {
		this.mark = mark;
	}
}
