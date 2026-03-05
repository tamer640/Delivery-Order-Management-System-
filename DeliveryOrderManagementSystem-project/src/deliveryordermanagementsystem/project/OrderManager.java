
package deliveryordermanagementsystem.project;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Details: " + order.getOrderDetails());
            System.out.println("Price: " + order.getPrice());
            System.out.println("Status: " + order.getStatus());
            System.out.println("----------------------");
        }
    }

    public Order searchOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public void deleteOrder(int orderId) {
        Order order = searchOrder(orderId);
        if (order != null) {
            orders.remove(order);
        }
    }

    public void updateOrderStatus(int orderId, OrderStatus newStatus) {
        Order order = searchOrder(orderId);
        if (order != null) {
            order.updateStatus(newStatus);
        }
    }
    
}
