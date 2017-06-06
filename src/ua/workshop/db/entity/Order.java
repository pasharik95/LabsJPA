package ua.workshop.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private Date dateTime;
	private Worker worker;
	private Car car;
	private List<Process> processes;
	
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
	
}
