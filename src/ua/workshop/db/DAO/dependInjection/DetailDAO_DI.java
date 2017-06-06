package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IDetailDAO;
import ua.workshop.db.jpa.Detail;

public class DetailDAO_DI {

	private IDetailDAO detailDAO;
	
	public DetailDAO_DI(IDetailDAO detailDAO) {
		this.detailDAO = detailDAO;
	}

    
	public void saveDetail(Detail detail) {
		detailDAO.saveDetail(detail);
	}

	public void updateDetail(Detail detail) {
		detailDAO.updateDetail(detail);
	}

	public void deleteDetail(Detail detail) {
		detailDAO.deleteDetail(detail);
	}

	public Detail getDetailById(Integer detail_id) {
		Detail detail = detailDAO.getDetailById(detail_id);
		return detail;
	}

	public Integer getAllDetailCount() {
		Integer cnt = detailDAO.getAllDetailsCount();
		return cnt;
	}

	public Collection<Detail> getAllDetails() {
		List<Detail> details = (List<Detail>) detailDAO.getAllDetails();
		return details;
	}


}
