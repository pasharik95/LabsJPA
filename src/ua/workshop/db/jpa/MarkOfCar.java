package ua.workshop.db.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "markofcar")
public class MarkOfCar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameMarkOfCar;
	@OneToMany
	private List<ModelOfCar> models;
	
	public MarkOfCar(){}
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
	public List<ModelOfCar> getModels() {
		return models;
	}
	public void setModels(List<ModelOfCar> models) {
		this.models = models;
	}
}
