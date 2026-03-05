
package deliveryordermanagementsystem.project;

import java.util.Date;

public class Order {
    
    private int orderId;
    private String orderDetails;
    private double price;
    private OrderStatus status;
    private Date createdAt;
    private Customer customer;

    public Order(int orderId, String orderDetails, double price, Customer customer) {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
        this.price = price;
        this.customer = customer;
        this.status = OrderStatus.PENDING;
        this.createdAt = new Date();
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public double calculateTotal() {
        return price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public double getPrice() {
        return price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Customer getCustomer() {
        return customer;
    }
    
}
