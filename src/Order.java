import java.util.UUID;

public class Order {
    private int orderId;
    private String customerName;
    private int productId;
    private int quantity;
    private orderStatus status;

    public enum orderStatus {
        PENDING,
        SHIPPED,
        DELIVERED
    }

    public Order(int orderId,String customerName, int productId, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.status = orderStatus.PENDING; // By Default
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }


    public int getQuantity() {
        return quantity;
    }

    public orderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(orderStatus status) {
        this.status =  status;
    }


}
