package com.chiu.russianwar;

import java.util.Random;
import java.lang.Math;

/**
 * Created by brittanychiu on 7/31/16.
 */
public class Deck {
    public int value[] = new int[52];
    public String suits[] = new String[52];
    public Card cards[] = new Card[52];
    int deck_position = 0;

    public Deck(){


        for(int i = 0; i<52; i++) {
            value[i] = (i % 13) + 1;
        }

        for(int i = 0; i<13; i++) {
            suits[i] = "\u2665";
            suits[i+13] = "\u2666";
            suits[i+26] = "\u2663";
            suits[i+39] = "\u2660";
        }
        for(int i = 0; i<52; i++) {
            cards[i] = new Card(value[i], suits[i]);
        }
    }

    public void shuffle(){
        Card temp;
        int index1, index2;
        Random ro = new Random(System.currentTimeMillis());
        printDeck();
        for(int i=0; i<100; i++){
            index1 = Math.abs(ro.nextInt()%52);
            index2 = Math.abs(ro.nextInt()%52);
            temp = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = temp;
        }
        printDeck();
    }

    public Card draw() {

        Card card = cards[deck_position];
        if (deck_position >= 52){
            return null;
        }
        else {
            deck_position++;
            return card;
        }
    }

    // Testings
    public void printDeck(){
        System.out.print("Cards: ");
        for(int i=0; i<52; i++){
            System.out.print(cards[i] + " ");
        }
    }
}
