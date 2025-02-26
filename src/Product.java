import java.util.UUID;

public class Product {
    private UUID productId;
    private String name;
    private double price;
    //current quantity
    private int stockLevel;
    //minimum stock level before restocking is needed
    private int reorderThreshold;

    public Product(String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;

    }

    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    public void manageStock(int quantity) {
        if (quantity > stockLevel) {
            System.out.println("Not enough stock available.");
        } else {
            stockLevel -= quantity;
        }
    }

    public boolean restock() {  //check if restock is needed
        return stockLevel <= reorderThreshold;
    }

    public void productInf(){
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Level: " + stockLevel);
        System.out.println("Reorder Threshold: " + reorderThreshold);
    }

}

