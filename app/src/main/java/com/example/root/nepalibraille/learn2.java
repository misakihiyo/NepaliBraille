package com.example.root.nepalibraille;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class learn2 extends AppCompatActivity {
    int i = 0;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Vibrator vb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2);

        vb = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        one = (Button) findViewById(R.id.buttona);
        two = (Button) findViewById(R.id.buttonb);
        three = (Button) findViewById(R.id.buttonc);
        four = (Button) findViewById(R.id.buttond);
        five = (Button) findViewById(R.id.buttone);
        six = (Button) findViewById(R.id.buttonf);

        Intent mIntent = getIntent();
        int number[] = {mIntent.getIntExtra("intVariableName1", 0),
                mIntent.getIntExtra("intVariableName1", 0),
                mIntent.getIntExtra("intVariableName1", 0),
                mIntent.getIntExtra("intVariableName1", 0)};


        for (i = 0; i < 4; ++i){
            switch (number[ i ]) {
                case 2:
                    buttonclk(1);
                    break;
                case 3:
                    buttonclk(2);
                    break;

                case 5:
                    buttonclk(3);
                    break;
                case 7:
                    buttonclk(4);
                    break;
                case 11:
                    buttonclk(5);
                    break;
                case 13:
                    buttonclk(6);
                    break;
            }
    }
    }


    private void buttonclk(int m) {
        if (m==1){
            final MediaPlayer one1 = MediaPlayer.create(this, R.raw.one);
            one1.start();
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);
                }
            });

        }

        if (m==2){
            final MediaPlayer one2 = MediaPlayer.create(this, R.raw.two);
            one2.start();
            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);

                }
            });
        }

        if (m==3){
            final MediaPlayer one3= MediaPlayer.create(this, R.raw.three);
            one3.start();
            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);

                }
            });
        }
        if (m==4){
            final MediaPlayer one4 = MediaPlayer.create(this, R.raw.four);
            one4.start();
            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);

                }
            });
        }
        if (m==5){
            final MediaPlayer one5 = MediaPlayer.create(this, R.raw.five);
            one5.start();
            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);

                }
            });
        }
        if (m==6){
            final MediaPlayer one6 = MediaPlayer.create(this, R.raw.six);
            one6.start();
            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //  mp1.start();
                    vb.vibrate(500);

                }
            });

        }

    }
    }










