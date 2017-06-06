package ua.workshop.db.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ordr")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	@ManyToOne
	private Worker worker;
	@ManyToOne
	private Car car;
	@OneToMany(mappedBy="order")
	private List<Process> processes;
	private boolean status;
	
	public Order(){}
	public Order(int id, Date dateTime, Worker worker, Car car, List<Process> processes){
		setId(id);
		setDateTime(dateTime);
		setWorker(worker);
		setCar(car);
		setProcesses(processes);
	}
	
	@Override
	public String toString(){
		return "# - " + getId() + ", дата реєстрації - " + getDateTime() + ",\n\tавтомобіль - " + getCar();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void addProcess(Process process) {
		if(this.processes == null)
		{
			this.processes = new ArrayList<Process>();
			this.processes.add(process);
		}
		else
			this.processes.add(process);
	}
	public List<Process> getProcesses() {
		return processes;
	}
	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
