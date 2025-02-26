import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class OrderManager {
    private List<Order> orders;
    private ExecutorService executor;

    public OrderManager() {
        this.orders = new ArrayList<>();
        this.executor = Executors.newFixedThreadPool(3); // Use 3 pool
    }

    // Process a new order
    public void processOrder(Order order) {
        orders.add(order);
        System.out.println("New Order Placed: " + order.getOrderId());
        executor.submit(() -> updateOrderStatus(order));
    }

    //  using multithreading
    private void updateOrderStatus(Order order) {
        try {
            Thread.sleep(3000); //
            order.setOrderStatus(Order.orderStatus.SHIPPED);
            logOrderUpdate(order);

            Thread.sleep(3000);
            order.setOrderStatus(Order.orderStatus.SHIPPED);
            logOrderUpdate(order);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // fot updates
    private void logOrderUpdate(Order order) {
        System.out.println("Order " + order.getOrderId() + " updated to: " + order.getOrderStatus());
    }

    // Shut down the executor service after finsh
    public void shutdown() {
        executor.shutdown();
    }
}
