package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int total = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            arrayList.add(n);
        }
        for(int i = 0 ; i < arrayList.size(); i++){
            total += arrayList.get(i);
        }
        double aver = (double) total / arrayList.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + aver);
    }
}
