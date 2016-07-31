package com.chiu.russianwar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    Deck deck;
    Player player;
    public TextView myHand;
    public TextView atk;
    public Spinner attackHand;
    public List<Card> atkL;
    Card pick;
    String input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myHand = (TextView)findViewById(R.id.MyHand);
        atk = (TextView)findViewById(R.id.atk);
        attackHand = (Spinner)findViewById(R.id.atkHand);
        deck = new Deck();
        deck.shuffle();

        player = new Player(deck);
        myHand.setText(player.showHand());

//        // use default spinner item to show options in spinner
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, player.cardList());
//        attackHand.setAdapter(adapter);

    }
}
