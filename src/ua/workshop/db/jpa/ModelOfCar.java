package ua.workshop.db.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "modelofcar")
public class ModelOfCar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameModelOfCar;
	@ManyToOne
	private MarkOfCar markOfCar;
	
	public ModelOfCar(){}
	public ModelOfCar(int id, String nameModelOfCar, MarkOfCar markOfCar){
		setId(id);
		setNameModelOfCar(nameModelOfCar);
		setMarkOfCar(markOfCar);
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
	public MarkOfCar getMarkOfCar() {
		return markOfCar;
	}
	public void setMarkOfCar(MarkOfCar markOfCar) {
		this.markOfCar = markOfCar;
	}
}
