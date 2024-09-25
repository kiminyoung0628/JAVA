package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt(); //숫자를 입력하고 엔터를 하면 \n이 남기때문에
        scanner.nextLine(); //여기서 없애줌

        ProductOrder[] productorders = new ProductOrder[n];

        for(int i = 0 ; i < n; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productorders[i] = createOrder(productName, price, quantity);
        }

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
