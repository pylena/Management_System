import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product laptop = new Product("laptop", 1200, 20, 5);
        Product smartPhone = new Product("smartphone", 800, 10, 3);


        System.out.println("Enter average daily sales for Laptop:");
        int laptopSales = scanner.nextInt();
        //"Enter average daily sales for Laptop:
        System.out.println("Enter average daily sales for SmartPhone:");
        int phoneSales = scanner.nextInt();
        StockPredictor predictlaptop = new StockPredictor(laptop, laptopSales);
        StockPredictor predictsmartphone = new StockPredictor(smartPhone, phoneSales);

        predictlaptop.stockReport();
        predictsmartphone.stockReport();


        //Order System
        OrderManager orderManager = new OrderManager();

        // Creating  orders
        Order order1 = new Order(1, "Alice", 1, 2);
        Order order2 = new Order(1,"Bob", 2, 1);

        // Processing
        orderManager.processOrder(order1);
        orderManager.processOrder(order2);


        // Shutdown
        orderManager.shutdown();

        // GitHub Collaboration & Merge Conflict Resolution
        System.out.println("created from new Branch");


    }
}




