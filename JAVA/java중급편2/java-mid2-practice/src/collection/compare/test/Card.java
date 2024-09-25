package collection.compare.test;

import java.util.*;
public class Card implements Comparable<Card> {
    private int cardNum;
    private String cardShape;

    public Card(int cardNum, String cardShape){
        this.cardNum = cardNum;
        this.cardShape = cardShape;
    }

    public int getCardNum() {
        return cardNum;
    }

    public String getCardShape() {
        return cardShape;
    }

    @Override
    public int compareTo(Card o){
        if(this.cardNum > o.cardNum){
            return 1;
        }else if(this.cardNum == o.cardNum){
            return this.cardShape.compareTo(o.cardShape);
        }else{
            return -1;
        }
    }
}
