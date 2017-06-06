package ua.workshop.db.jpa;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colorofcar")
public class ColorOfCar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameColorOfCar;
	
	public ColorOfCar(){}
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
