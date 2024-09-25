package collection.set.test;

import java.util.*;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));
        Set<Integer> sumSet = new HashSet<>();
        Set<Integer> gyoSet = new HashSet<>();
        Set<Integer> chaSet = new HashSet<>();
        for(Integer s : set1){
            sumSet.add(s);
        }
        for(Integer s : set2){
            sumSet.add(s);
        }
        for(Integer s1 : set1){
            if(set2.contains(s1)){
                gyoSet.add(s1);
            }
        }
        for(Integer s1 : set1){
            if(!gyoSet.contains(s1)){
                chaSet.add(s1);
            }
        }
        System.out.println("합집합: " + sumSet);
        System.out.println("교집합: " + gyoSet);
        System.out.println("차집합: " + chaSet);
    }
}
