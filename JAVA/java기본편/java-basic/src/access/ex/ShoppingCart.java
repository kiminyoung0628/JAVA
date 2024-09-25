package access.ex;

public class ShoppingCart {
    private int count;
    private Item[] cart = new Item[10];
    public void addItem(Item item){
        if(count >= cart.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        cart[count] = item;
        count++;
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0 ; i < count; i++){
            System.out.println("상품이름:" + cart[i].getName() + ",상품 총 가격:" + cart[i].getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0 ; i < count; i++) {
            Item item = cart[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
