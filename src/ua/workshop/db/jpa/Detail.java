package ua.workshop.db.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "detail")
public class Detail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private StandartDetail standartDetail;
	@ManyToOne
	private Car car;
	@OneToMany(mappedBy="detail")
	private List<ProcessHasDetail> processHasDetail;
	public int getId() {
		return id;
	}
	public Detail(){}
	public Detail(int id, StandartDetail standartDetail, Car car, List<ProcessHasDetail> processHasDetail){
		setId(id);
		setCar(car);
		setStandartDetail(standartDetail);
		setProcessHasDetail(processHasDetail);
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
