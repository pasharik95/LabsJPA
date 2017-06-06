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
@Table(name = "process")
public class Process{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeStart;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTimeFinish;
	@ManyToOne
	private Worker worker;
	@ManyToOne
	private Operation operation;
	@ManyToOne
	private Order order;
	@OneToMany(mappedBy="process")
	private List<ProcessHasDetail> processHasDetail;
	
	public Process(){}
	public Process(int id, Date dateTimeStart, Date dateTimeFinish, Worker worker, Operation operation, Order order, List<ProcessHasDetail> processHasDetail){
		setId(id);
		setDateTimeStart(dateTimeStart);
		setDateTimeFinish(dateTimeFinish);
		setWorker(worker);
		setOperation(operation);
		setOrder(order);
		setProcessHasDetail(processHasDetail);
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
	public void addProcessHasDetail(ProcessHasDetail processHasDetail) {
		if(this.processHasDetail == null){
			this.processHasDetail = new ArrayList<ProcessHasDetail>();
			this.processHasDetail.add(processHasDetail);
		}else
			this.processHasDetail.add(processHasDetail);
	}
	public List<ProcessHasDetail> getProcessHasDetail() {
		return processHasDetail;
	}
	public void setProcessHasDetail(List<ProcessHasDetail> processHasDetail) {
		this.processHasDetail = processHasDetail;
	}
}
