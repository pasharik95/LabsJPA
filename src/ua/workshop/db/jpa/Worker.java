package ua.workshop.db.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	@OneToMany(mappedBy="worker")
	private List<Process> processes;
	@OneToMany(mappedBy="worker")
	private List<Order> orders;
	
	public Worker(){}
	public Worker(int id, String firstName, String lastName, String middleName, List<Process> processes, List<Order> orders){
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setMiddleName(middleName);
		setProcesses(processes);
		setOrders(orders);
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
	public void addProcess(Process process) {
		if(this.processes != null)
			processes.add(process);
		else{
			processes = new ArrayList<Process>();
			processes.add(process);
		}
	}
	public List<Process> getProcesses() {
		return processes;
	}
	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString(){
		return getLastName() + " " + getFirstName() + " " + getMiddleName();
	}
	
}
