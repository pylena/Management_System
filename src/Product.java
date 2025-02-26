public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    //current quantity
    private int stockLevel;
    private int reorderThreshold;

    public Product(String productId, String productName, double productPrice, int stockLevel, int reorderThreshold) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;

    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public int getStockLevel() {
        return stockLevel;
    }
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
    public int getReorderThreshold() {
        return reorderThreshold;
    }
    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }

}
