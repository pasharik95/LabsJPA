package ua.workshop.db.entity;

public class Detail {
	private int id;
	private StandartDetail standartDetail;
	private Car car;
	public int getId() {
		return id;
	}
	public Detail(int id, StandartDetail standartDetail, Car car){
		setId(id);
		setCar(car);
		setStandartDetail(standartDetail);
	}
	public void setId(int id) {
		this.id = id;
	}
	public StandartDetail getStandartDetail() {
		return standartDetail;
	}
	public void setStandartDetail(StandartDetail standartDetail) {
		this.standartDetail = standartDetail;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}
