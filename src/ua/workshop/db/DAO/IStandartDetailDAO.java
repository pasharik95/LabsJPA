package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IStandartDetailDAO {
	public void saveStandartDetail(StandartDetail StandartDetail);
	public void updateStandartDetail(StandartDetail StandartDetail);
	public StandartDetail getStandartDetailById(Integer StandartDetail_id);
	public Integer getAllStandartDetailsCount();
	public Collection<StandartDetail> getAllStandartDetails();
	public void deleteStandartDetail(StandartDetail StandartDetail);
}
