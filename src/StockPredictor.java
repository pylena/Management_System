public class StockPredictor {
    private Product product;
    private int avgSales;

    // Constructor to initialize Product and avgDailySales
    public StockPredictor(Product product, int avgSales) {
        this.product = product;
        this.avgSales = avgSales;
    }

    // Predicts when stock will run out
    public int predictDays() {
        if (avgSales == 0) return product.getStockLevel(); // Avoid division by zero
        return product.getStockLevel() / avgSales;
    }

    // Suggests restocking
    public String suggestedDays() {
        int trackDays = predictDays();
        if (trackDays < 3) {
            return "Danger: Restock is needed ASAP!";
        } else if (trackDays <= 5) {
            return "Moderate: Consider restocking soon.";
        } else {
            return "Safe: No restock needed.";
        }
    }

    // Generates a stock report
    public void stockReport() {
        System.out.println("Stock Report for: " + product.getName());
        System.out.println("Days until stock out: " + predictDays());
        System.out.println("Restock Suggestion: " + suggestedDays());
        System.out.println("----------------------------");
    }
}
