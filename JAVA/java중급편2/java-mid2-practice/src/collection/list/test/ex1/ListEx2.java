package collection.list.test.ex1;

import java.util.*;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세여 (종료 0)");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            arrayList.add(n);
        }
        for(int i = 0 ; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
}
