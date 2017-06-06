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
@Table(name = "standartdetail")
public class StandartDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameStandartDetail;
	@OneToMany
	private List<Detail> details;
	
	public StandartDetail(){}
	public StandartDetail(int id, String nameStandartDetail, List<Detail> details){
		setId(id);
		setNameStandartDetail(nameStandartDetail);
		setDetails(details);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameStandartDetail() {
		return nameStandartDetail;
	}
	public void setNameStandartDetail(String nameStandartDetail) {
		this.nameStandartDetail = nameStandartDetail;
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
