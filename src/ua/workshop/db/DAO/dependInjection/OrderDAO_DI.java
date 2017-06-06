package ua.workshop.db.DAO.dependInjection;

import java.util.Collection;
import java.util.List;

import ua.workshop.db.DAO.IOrderDAO;
import ua.workshop.db.jpa.Order;

public class OrderDAO_DI {

	private IOrderDAO orderDAO;
	
	public OrderDAO_DI(IOrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

    
	public void saveOrder(Order order) {
		orderDAO.saveOrder(order);
	}

	public void updateOrder(Order order) {
		orderDAO.updateOrder(order);
	}

	public void deleteOrder(Order order) {
		orderDAO.deleteOrder(order);
	}

	public Order getOrderById(Integer order_id) {
		Order order = orderDAO.getOrderById(order_id);
		return order;
	}

	public Integer getAllOrderCount() {
		Integer cnt = orderDAO.getAllOrdersCount();
		return cnt;
	}

	public Collection<Order> getAllOrders() {
		List<Order> orders = (List<Order>) orderDAO.getAllOrders();
		return orders;
	}


}
