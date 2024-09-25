package collection.compare.test;

import java.util.*;
import java.util.ArrayList;

public class CardGameMain {
    public static void main(String[] args) {
        List<Card> list1 = new ArrayList<>();
        List<Card> list2 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("플레이어1 입력: ");
        for(int i = 0 ; i < 5; i++){
            System.out.print("카드 뽑기: ");
            String[] words = scanner.nextLine().split(" ");
            int num = Integer.parseInt(words[0]);
            String shape = words[1];
            list1.add(new Card(num, shape));
        }
        System.out.println("플레이어2 입력: ");
        for(int i = 0; i < 5; i++){
            System.out.print("카드 뽑기: ");
            String[] words = scanner.nextLine().split(" ");
            int num = Integer.parseInt(words[0]);
            String shape = words[1];
            list2.add(new Card(num, shape));
        }
        list1.sort(null);
        list2.sort(null);
        System.out.print("플레이어1의 카드: ");
        for(Card card : list1){
            System.out.print(card.getCardNum() + "(" + card.getCardShape() + ")");
        }
        System.out.print("플레이어2의 카드: ");
        for(Card card : list2){
            System.out.print(card.getCardNum() + "(" + card.getCardShape() + ")");
        }
    }
}
