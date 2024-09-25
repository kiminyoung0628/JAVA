package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productorders = new ProductOrder[3];
        productorders[0] = createOrder("두부", 2000, 2);
        productorders[1] = createOrder("김치", 5000, 2);
        productorders[2] = createOrder("콜라", 1500, 2);

        printOrders(productorders);
        int total = getTotalAmount(productorders);
        System.out.println(total);
    }

    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder productOrder : productOrders) {
            System.out.println(productOrder.productName + " " + productOrder.price + " " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            total += productOrder.price * productOrder.quantity;
        }
        return total;
    }
}
