package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IStandartDetailDAO;
import ua.workshop.db.jpa.StandartDetail;

public class StandartDetailDAO_DI {

	private IStandartDetailDAO standartDetailDAO;
	
	public StandartDetailDAO_DI(IStandartDetailDAO standartDetailDAO) {
		this.standartDetailDAO = standartDetailDAO;
	}

    
	public void saveStandartDetail(StandartDetail standartDetail) {
		standartDetailDAO.saveStandartDetail(standartDetail);
	}

	public void updateStandartDetail(StandartDetail standartDetail) {
		standartDetailDAO.updateStandartDetail(standartDetail);
	}

	public void deleteStandartDetail(StandartDetail standartDetail) {
		standartDetailDAO.deleteStandartDetail(standartDetail);
	}

	public StandartDetail getStandartDetailById(Integer standartDetail_id) {
		StandartDetail standartDetail = standartDetailDAO.getStandartDetailById(standartDetail_id);
		return standartDetail;
	}

	public Integer getAllStandartDetailCount() {
		Integer cnt = standartDetailDAO.getAllStandartDetailsCount();
		return cnt;
	}

	public Collection<StandartDetail> getAllStandartDetails() {
		List<StandartDetail> standartDetails = (List<StandartDetail>) standartDetailDAO.getAllStandartDetails();
		return standartDetails;
	}


}
