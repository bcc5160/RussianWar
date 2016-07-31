package com.chiu.russianwar;

/**
 * Created by brittanychiu on 7/31/16.
 */
public class Card {
    int value;
    String suit;


    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){
        return value;
    }

    public String getSuit(){
        return suit;
    }
}
