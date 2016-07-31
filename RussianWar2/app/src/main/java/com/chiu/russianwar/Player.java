package com.chiu.russianwar;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.*;

/**
 * Created by brittanychiu on 7/31/16.
 */
public class Player {
    public List<Card> hand;

    public Player(Deck deck){
        hand = new ArrayList<Card>();
        Card newCard;
        for(int i = 0; i<8; i++) {
            newCard = deck.draw();
            hand.add(newCard);
        }
    }

    // Add to attack array in main class and nullify in hand
    public void attack(Card atk, List<Card> atkL){
        atkL.add(atk);
        hand.remove(hand.indexOf(atk));
    }

    public void defend(Card def, List<Card> defL){
        defL.add(def);
        hand.remove(hand.indexOf(def));
    }

    public String showHand(){
        String  strHand = "";
        for(int i=0; i<hand.size(); i++) {
            strHand += hand.get(i).getValue();
            strHand += hand.get(i).getSuit();
            strHand += " ";
        }

        return strHand;
    }


//    public ArrayList<String> cardList(){
//        ArrayList<String> options = new ArrayList<>();
//
//        for(int i=0; i<hand.size(); i++) {
//            String str = "";
//            str += hand.get(i).getValue();
//            str += hand.get(i).getSuit();
//            str += " ";
//
//            options.add(str);
//        }
//
//        return options;
//
//    }

}
