
package deliveryordermanagementsystem.project;


public class DeliveryOrderManagementSystemProject {

   
    public static void main(String[] args) {
     
        // 1) Create Manager
        OrderManager manager = new OrderManager();

        // 2) Create Customer
        Customer customer1 = new Customer("Ali", "0590000000", "Gaza");

        // 3) Create Order and Add it
        Order order1 = new Order(1, "Food Order", 20.5, customer1);
        manager.addOrder(order1);

        // 4) View Orders
        System.out.println("=== Orders List ===");
        manager.viewOrders();

        // 5) Update Status
        manager.updateOrderStatus(1, OrderStatus.ON_THE_WAY);

        System.out.println("=== After Status Update ===");
        manager.viewOrders();

        // 6) Delete Order
        manager.deleteOrder(1);

        System.out.println("=== After Delete ===");
        manager.viewOrders();
    }
        
    }
    

