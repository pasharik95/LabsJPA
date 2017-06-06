package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IDetailDAO {
	public void saveDetail(Detail Detail);
	public void updateDetail(Detail Detail);
	public Detail getDetailById(Integer Detail_id);
	public Integer getAllDetailsCount();
	public Collection<Detail> getAllDetails();
	public void deleteDetail(Detail Detail);
}
