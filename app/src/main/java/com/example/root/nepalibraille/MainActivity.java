package com.example.root.nepalibraille;


import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Vibrator vb;
    Button learn;

    public int mul=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vb=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        learn = (Button) findViewById(R.id.Learn);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  mp1.start();
                vb.vibrate(100);
                String first = one.getText().toString();
                Integer first_conv = Integer.parseInt(first);
                operate(first);


            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   mp1.pause();
                vb.vibrate(150);
                String second = two.getText().toString();
                operate(second);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vb.vibrate(200);
                String third = three.getText().toString();
                operate(third);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vb.vibrate(250);
                String forth = four.getText().toString();
                operate(forth);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vb.vibrate(300);
                String fifth = five.getText().toString();
                operate(fifth);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vb.vibrate(350);
                String sixth = six.getText().toString();
                operate(sixth);
            }
        });

        learn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, LearnActivity.class);
                        startActivity(intent);
            }
        }));


    }

    public String operate(String a){
        if (a =="1")
        {
            int multiply = mul;
            mul = 1;
            play(multiply);
            return (String.valueOf(multiply));


        }

        else {
            mul = mul * Integer.valueOf(a);
            return String.valueOf(mul);
        }

    }

    public boolean dispatchKeyEvent(KeyEvent kevent){
        String sth= "1";
        int action = kevent.getAction();
        int keycode = kevent.getKeyCode();
        switch (keycode){
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN){
                    operate(sth);
                }
                break;
        }
        return false;
    }





    public int play(int p) {


        switch(p) {
            case 2:
                //  playplay(R.raw.a_2);
                final MediaPlayer a_2 = MediaPlayer.create(this, R.raw.a_2);
                a_2.start();
                break;
            case 231:
                final MediaPlayer a_231 = MediaPlayer.create(this, R.raw.a_231);
                a_231.start();
                break;
            case 15:
                final MediaPlayer a_15 = MediaPlayer.create(this, R.raw.a_15);
                a_15.start();
                break;
            case 77:
                final MediaPlayer a_77 = MediaPlayer.create(this, R.raw.a_77);
                a_77.start();
                break;
            case 286:
                final MediaPlayer a_286 = MediaPlayer.create(this, R.raw.a_286);
                a_286.start();
                break;
            case 910:
                final MediaPlayer a_910 = MediaPlayer.create(this, R.raw.a_910);
                a_910.start();
                break;

            case 14:
                final MediaPlayer a_14 = MediaPlayer.create(this, R.raw.a_14);
                a_14.start();
                break;
            case 33:
                final MediaPlayer a_33 = MediaPlayer.create(this, R.raw.a_33);
                a_33.start();
                break;
            case 154:
                final MediaPlayer a_154 = MediaPlayer.create(this, R.raw.a_154);
                a_154.start();
                break;
            case 195:
                final MediaPlayer a_195 = MediaPlayer.create(this, R.raw.a_195);
                a_195.start();
                break;
            case 22:
                final MediaPlayer a_22 = MediaPlayer.create(this, R.raw.a_22);
                a_22.start();
                break;
            case 39:
                final MediaPlayer a_39 = MediaPlayer.create(this, R.raw.a_39);
                a_39.start();
                break;
            case 210:
                final MediaPlayer a_210 = MediaPlayer.create(this, R.raw.a_210);
                a_210.start();
                break;
            case 130:
                final MediaPlayer a_130 = MediaPlayer.create(this, R.raw.a_130);
                a_130.start();
                break;
            case 429:
                final MediaPlayer a_429 = MediaPlayer.create(this, R.raw.a_429);
                a_429.start();
                break;
            case 6:
                final MediaPlayer a_6 = MediaPlayer.create(this, R.raw.a_6);
                a_6.start();
                break;
            case 26:
                final MediaPlayer a_26 = MediaPlayer.create(this, R.raw.a_26);
                a_26.start();
                break;

            case 105:
                final MediaPlayer a_105 = MediaPlayer.create(this, R.raw.a_105);
                a_105.start();
                break;
            case 1001:
                final MediaPlayer a_1001 = MediaPlayer.create(this, R.raw.a_1001);
                a_1001.start();
                break;
            case 35:
                final MediaPlayer a_35 = MediaPlayer.create(this, R.raw.a_35);
                a_35.start();
                break;
            case 15015:
                final MediaPlayer a_15015 = MediaPlayer.create(this, R.raw.a_15015);
                a_15015.start();
                break;
            case 1365:
                final MediaPlayer a_1365 = MediaPlayer.create(this, R.raw.a_1365);
                a_1365.start();
                break;
            case 390:
                final MediaPlayer a_390 = MediaPlayer.create(this, R.raw.a_390);
                a_390.start();
                break;
            case 30020:
                final MediaPlayer a_30020 = MediaPlayer.create(this, R.raw.a_30020);
                a_30020.start();
                break;
            case 1155:
                final MediaPlayer a_1155 = MediaPlayer.create(this, R.raw.a_1155);
                a_1155.start();
                break;
            case 546:
                final MediaPlayer a_546 = MediaPlayer.create(this, R.raw.a_546);
                a_546.start();
                break;
            case 42:
                final MediaPlayer a_42 = MediaPlayer.create(this, R.raw.a_42);
                a_42.start();
                break;
            case 2145:
                final MediaPlayer a_2145 = MediaPlayer.create(this, R.raw.a_2145);
                a_2145.start();
                break;

            case 462:
                final MediaPlayer a_462 = MediaPlayer.create(this, R.raw.a_462);
                a_462.start();
                break;
            case 330:
                final MediaPlayer a_330 = MediaPlayer.create(this, R.raw.a_330);
                a_330.start();
                break;
            case 385:
                final MediaPlayer a_385 = MediaPlayer.create(this, R.raw.a_154);
                a_385.start();
                break;
            case 10:
                final MediaPlayer a_10 = MediaPlayer.create(this, R.raw.a_10);
                a_10.start();
                break;
            case 21:
                final MediaPlayer a_21 = MediaPlayer.create(this, R.raw.a_21);
                a_21.start();
                break;
            case 66:
                final MediaPlayer a_66 = MediaPlayer.create(this, R.raw.a_66);
                a_66.start();
                break;
            case 6006:
                final MediaPlayer a_6006 = MediaPlayer.create(this, R.raw.a_6006);
                a_6006.start();
                break;
            case 770:
                final MediaPlayer a_770 = MediaPlayer.create(this, R.raw.a_770);
                a_770.start();
                break;
            case 110:
                final MediaPlayer a_110 = MediaPlayer.create(this, R.raw.a_110);
                a_110.start();
                break;
            case 1430:
                final MediaPlayer a_1430 = MediaPlayer.create(this, R.raw.a_1430);
                a_1430.start();
                break;
            case 78:
                final MediaPlayer a_78 = MediaPlayer.create(this, R.raw.a_78);
                a_78.start();
                break;

            case 4290:
                final MediaPlayer a_4290 = MediaPlayer.create(this, R.raw.a_4290);
                a_4290.start();
                break;
            case 165:
                final MediaPlayer a_165 = MediaPlayer.create(this, R.raw.a_165);
                a_165.start();
                break;
            case 70:
                final MediaPlayer a_70 = MediaPlayer.create(this, R.raw.a_70);
                a_70.start();
                break;
            case 2310:
                final MediaPlayer a_2310 = MediaPlayer.create(this, R.raw.a_2310);
                a_2310.start();
                break;
            case 182:
                final MediaPlayer a_182 = MediaPlayer.create(this, R.raw.a_182);
                a_182.start();
                break;
        }
        return 0;
    }




}

