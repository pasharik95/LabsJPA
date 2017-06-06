package ua.workshop.db.entity;

import java.util.List;


public class MarkOfCar {
	private int id;
	private String nameMarkOfCar;
	private List<ModelOfCar> models;
	
	public MarkOfCar(int id, String nameMarkOfCar, List<ModelOfCar> arrayList){
		setId(id);
		setNameMarkOfCar(nameMarkOfCar);
		setModels(arrayList);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameMarkOfCar() {
		return nameMarkOfCar;
	}
	public void setNameMarkOfCar(String nameMarkOfCar) {
		this.nameMarkOfCar = nameMarkOfCar;
	}
	public void addModel(ModelOfCar model) {
		models.add(model);
	}
	public List<ModelOfCar> getModels() {
		return models;
	}
	public void setModels(List<ModelOfCar> models) {
		this.models = models;
	}
}
