package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> cart;
    public ShoppingCart(){
        cart = new ArrayList<>();
    }

    public void addItem(Item item){
        cart.add(item);
    }
    public void displayItems(){
        int total = 0;
        int n = cart.size();
        for(int i = 0 ; i < n ; i++){
            total += cart.get(i).getTotalPrice();
            System.out.println("상품명: " + cart.get(i).getName() + ", 합계" + cart.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합: " + total);
    }

}
