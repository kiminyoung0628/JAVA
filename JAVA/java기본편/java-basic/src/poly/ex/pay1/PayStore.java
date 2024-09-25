package poly.ex.pay1;

import poly.ex.pay0.DefaultPay;
import poly.ex.pay0.KakaoPay;
import poly.ex.pay0.NaverPay;
import poly.ex.pay0.NewPay;
import poly.ex.pay0.Pay;

public abstract class PayStore {
    //새로 추가하면 변하는 부분
    public static Pay findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new NaverPay();
        }else if(option.equals("new")){
            return new NewPay();
        }
        else{
            return new DefaultPay();
        }
    }
}
