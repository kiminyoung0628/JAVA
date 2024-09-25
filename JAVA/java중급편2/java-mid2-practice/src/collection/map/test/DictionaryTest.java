package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String English = scanner.nextLine();
            if(English.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String korean = scanner.nextLine();
            map.put(English, korean);
        }

        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String En = scanner.nextLine();
            if(En.equals("q")){
                break;
            }
            boolean flag = false;
            for(String key : map.keySet()){
                if(En.equals(key)){
                    flag = true;
                    System.out.println(En + "의 뜻 : " + map.get(key));
                }
            }
            if(!flag){
                System.out.println(En + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
