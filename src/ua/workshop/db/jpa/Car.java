package ua.workshop.db.jpa;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name = "car")
public class Car{
	public Car(){}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vincod;
	private String registrNumber;
	@ManyToOne
	private ModelOfCar modelOfCar;
	@ManyToOne
	private ColorOfCar colorOfCar;
	@ManyToOne
	private Client client;
	private int distance;
	private int year;
	@OneToMany(mappedBy="car")
	List<Detail> details;
	@OneToMany(mappedBy="car")
	List<Order> orders;
	
	public Car(int id, String vincode, String registrNumber, ModelOfCar modelOfCar, ColorOfCar colorOfCar, int distance, int year){
		setId(id);
		setVincode(vincode);
		setRegistrNumber(registrNumber);
		setModelOfCar(modelOfCar);
		setColorOfCar(colorOfCar);
		setClient(client);
		setDistance(distance);
		setYear(year);
	}
	
	@Override
	public String toString(){
		return  getModelOfCar().getMarkOfCar().getNameMarkOfCar() + " " + getModelOfCar().getNameModelOfCar() +
				" , реєстраційний номер - " + getRegistrNumber() + " , колір - " + getColorOfCar().getNameColorOfCar() +
				" , рiк випуску - " + getYear();
	}
	
	public String getRegistrNumber() {
		return registrNumber;
	}
	public void setRegistrNumber(String registrNumber) {
		this.registrNumber = registrNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVincode() {
		return vincod;
	}
	public void setVincode(String vincod) {
		this.vincod = vincod;
	}
	public ModelOfCar getModelOfCar() {
		return modelOfCar;
	}
	public void setModelOfCar(ModelOfCar modelOfCar) {
		this.modelOfCar = modelOfCar;
	}
	public ColorOfCar getColorOfCar() {
		return colorOfCar;
	}
	public void setColorOfCar(ColorOfCar colorOfCar) {
		this.colorOfCar = colorOfCar;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void addDetail(Detail detail){
		details.add(detail);
	}
	public List<Detail> getDetails() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
