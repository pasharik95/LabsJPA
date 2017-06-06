package ua.workshop.db.entity;

import java.util.ArrayList;
import java.util.List;

public class StandartDetail {
	private int id;
	private String nameStandartDetail;
	private List<Detail> details;
	
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
