package ua.workshop.db.entity;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private List<Process> processes;
	private List<Operation> operations;
	private List<Order> orders;
	
	public Worker(int id, String firstName, String lastName, String middleName, List<Process> processes, List<Operation> operations, List<Order> orders){
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setMiddleName(middleName);
		setProcesses(processes);
		setOperations(operations);
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
	
	public void addOperation(Operation operation) {
		if(this.operations != null)
			operations.add(operation);
		else{
			operations = new ArrayList<Operation>();
			operations.add(operation);
		}
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
