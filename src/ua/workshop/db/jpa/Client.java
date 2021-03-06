package ua.workshop.db.jpa;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String phone;
	private String email;
	
	@OneToMany(mappedBy="client")
	List<Car> cars;
	
	public Client(){}
	public Client(int id, String firstName, String lastName, String middleName, String phone, String email, List<Car> cars){
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setMiddleName(middleName);
		setPhone(phone);
		setEmail(email);
		setCars(cars);
	}
	@Override
	public String toString(){
		
		return  "# - " + getId() + ", i�'� - " + getMiddleName() + " " + getFirstName() +
				" " + getLastName() + ", ������� - " + getPhone();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void addCar(Car car){
		cars.add(car);
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
