package collection.map.test;

import java.util.*;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"java", "10000"},{"Spring", "20000"}, {"JPA",
                "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < productArr.length; i++){
            String productName = productArr[i][0];
            int productPrice = Integer.valueOf(productArr[i][1]);
            map.put(productName, productPrice);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
        for(String key : map.keySet()){
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
