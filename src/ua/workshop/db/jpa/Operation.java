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
@Table(name = "operation")
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameOperation;
	private double duration;
	@OneToMany(mappedBy="operation")
	private List<Process> processes;
	
	public Operation(){}
	public Operation(int id, String nameOperation, double duration, List<Process> processes) {
		setId(id);
		setNameOperation(nameOperation);
		setDuration(duration);
		setProcesses(processes);
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
}
