package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;
    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;
        while(count < 6){
            int number = random.nextInt(45) + 1;
            //중복되지 않은 경우에만 배열에 추가
            if(isUnique(number)){
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }
    public boolean isUnique(int number){
        for(int i = 0 ; i < count; i++){
            if(lottoNumbers[i] == number){
                return false;
            }
        }
        return true;
    }
    public void Print(){
        System.out.print("로또 번호: ");
        for(int i = 0 ; i < 6; i++){
            System.out.print(lottoNumbers[i] + " ");
        }
    }
}
