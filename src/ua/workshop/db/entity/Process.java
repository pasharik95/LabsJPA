package ua.workshop.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Process {
	private int id;
	private Date dateTimeStart;
	private Date dateTimeFinish;
	private Worker worker;
	private Operation operation;
	private Order order;
	private List<Detail> details;
	
	public Process(int id, Date dateTimeStart, Date dateTimeFinish, Worker worker, Operation operation, Order order, List<Detail> details){
		setId(id);
		setDateTimeStart(dateTimeStart);
		setDateTimeFinish(dateTimeFinish);
		setWorker(worker);
		setOperation(operation);
		setOrder(order);
		setDetails(details);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateTimeStart() {
		return dateTimeStart;
	}
	public void setDateTimeStart(Date dateTimeStart) {
		this.dateTimeStart = dateTimeStart;
	}
	public Date getDateTimeFinish() {
		return dateTimeFinish;
	}
	public void setDateTimeFinish(Date dateTimeFinish) {
		this.dateTimeFinish = dateTimeFinish;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void addDetail(Detail detail) {
		if(this.details == null){
			this.details = new ArrayList<Detail>();
			this.details.add(detail);
		}else
			this.details.add(detail);
	}
	public List<Detail> getDetails() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
}
