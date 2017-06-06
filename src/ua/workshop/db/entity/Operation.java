package ua.workshop.db.entity;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	private int id;
	private String nameOperation;
	private double duration;
	private List<Worker> workers;
	private List<Process> processes;
	
	public Operation(int id, String nameOperation, double duration, List<Worker> workers, List<Process> processes) {
		setId(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOperation() {
		return nameOperation;
	}
	public void setNameOperation(String nameOperation) {
		this.nameOperation = nameOperation;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public void addWorker(Worker worker) {
		if(this.workers != null)
			workers.add(worker);
		else{
			workers = new ArrayList<Worker>();
			workers.add(worker);
		}
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	
	public void addProcess(Process process) {
		if(this.processes != null)
			processes.add(process);
		else{
			processes = new ArrayList<Process>();
			processes.add(process);
		}
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	public List<Process> getProcesses() {
		return processes;
	}
	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}
}
