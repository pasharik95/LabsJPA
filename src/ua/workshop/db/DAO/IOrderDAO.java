package ua.workshop.db.DAO;

import java.util.Collection;
import ua.workshop.db.jpa.*;

public interface IOrderDAO {
	public void saveOrder(Order Order);
	public void updateOrder(Order Order);
	public Order getOrderById(Integer Order_id);
	public Integer getAllOrdersCount();
	public Collection<Order> getAllOrders();
	public void deleteOrder(Order Order);
}
