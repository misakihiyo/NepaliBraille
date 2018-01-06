package com.example.root.nepalibraille;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {
    private final static int idArray[]=  {R.id.b_2,R.id.b_231,R.id.b_15,R.id.b_77,
            R.id.b_286,R.id.b_910,R.id.b_14,R.id.b_33,R.id.b_154,R.id.b_195};/*,R.id.b_22,
            R.id.b_39,R.id.b_210,R.id.b_130,R.id.b_429,R.id.b_6,R.id.b_26,R.id.b_105,
            R.id.b_1001,R.id.b_35,R.id.b_15015,R.id.b_1365,R.id.b_390,R.id.b_30020,R.id.b_3003,
            R.id.b_1155,R.id.b_546,R.id.b_42,R.id.b_2145,R.id.b_462,R.id.b_330,R.id.b_385,
            R.id.b_10,R.id.b_21,R.id.b_66,R.id.b_6006,R.id.b_770,R.id.b_110,R.id.b_1430,
            R.id.b_78,R.id.b_4290,R.id.b_165,R.id.b_70,R.id.b_2310,R.id.b_182};*/
    private Button[] button = new Button[idArray.length];
    int n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        for (n=0; n<idArray.length;n++) {
            button[ n ] = (Button) findViewById(idArray[ n ]);

            button[ n ].setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    switch (view.getId()) {
                        case R.id.b_2:
                            final MediaPlayer one1 = MediaPlayer.create(getApplicationContext(), R.raw.a_2);
                            one1.start();
                            break;
                        case R.id.b_231:
                            final MediaPlayer a_231 = MediaPlayer.create(getApplicationContext(), R.raw.a_231);
                            a_231.start();
                            break;
                        case R.id.b_15:
                            final MediaPlayer a15 = MediaPlayer.create(getApplicationContext(), R.raw.a_15);
                            a15.start();
                            break;
                        case R.id.b_77:
                            final MediaPlayer a77 = MediaPlayer.create(getApplicationContext(), R.raw.a_77);
                            a77.start();
                            break;
                        case R.id.b_286:
                            final MediaPlayer a286 = MediaPlayer.create(getApplicationContext(), R.raw.a_286);
                            a286.start();
                            break;
                        case R.id.b_910:
                            final MediaPlayer a910 = MediaPlayer.create(getApplicationContext(), R.raw.a_910);
                            a910.start();
                            break;
                        case R.id.b_14:
                            final MediaPlayer a14 = MediaPlayer.create(getApplicationContext(), R.raw.a_14);
                            a14.start();
                            break;
                        case R.id.b_33:
                            final MediaPlayer a33 = MediaPlayer.create(getApplicationContext(), R.raw.a_33);
                            a33.start();
                            break;
                        case R.id.b_154:
                            final MediaPlayer a154 = MediaPlayer.create(getApplicationContext(), R.raw.a_154);
                            a154.start();
                        case R.id.b_195:
                            final MediaPlayer a195 = MediaPlayer.create(getApplicationContext(), R.raw.a_195);
                            a195.start();
                            break;
                        case R.id.b_22:
                            final MediaPlayer a_22 = MediaPlayer.create(getApplicationContext(),R.raw.a_22);
                            a_22.start();
                            break;
                        case R.id.b_39:
                            final MediaPlayer a_39 = MediaPlayer.create(getApplicationContext(),R.raw.a_39);
                            a_39.start();
                            break;
                        case R.id.b_210:
                            final MediaPlayer a_210= MediaPlayer.create(getApplicationContext(),R.raw.a_210);
                            a_210.start();
                            break;
                        case R.id.b_130:
                            final MediaPlayer a_130 = MediaPlayer.create(getApplicationContext(),R.raw.a_130);
                            a_130.start();
                            break;
                        case R.id.b_429:
                            final MediaPlayer a_429 = MediaPlayer.create(getApplicationContext(),R.raw.a_429);
                            a_429.start();
                            break;
                        case R.id.b_6:
                            final MediaPlayer a_6 = MediaPlayer.create(getApplicationContext(),R.raw.a_6);
                            a_6.start();
                            break;
                        case R.id.b_26:
                            final MediaPlayer a_26= MediaPlayer.create(getApplicationContext(),R.raw.a_26);
                            a_26.start();
                            break;
                        case R.id.b_105:
                            final MediaPlayer a_105= MediaPlayer.create(getApplicationContext(),R.raw.a_105);
                            a_105.start();
                            break;
                        case R.id.b_1001:
                            final MediaPlayer a_1001 = MediaPlayer.create(getApplicationContext(),R.raw.a_1001);
                            a_1001.start();
                            break;
                        case R.id.b_35:
                            final MediaPlayer a_35 = MediaPlayer.create(getApplicationContext(),R.raw.a_35);
                            a_35.start();
                            break;
                        case R.id.b_15015:
                            final MediaPlayer a_15015= MediaPlayer.create(getApplicationContext(),R.raw.a_15015);
                            a_15015.start();
                            break;
                        case R.id.b_1365:
                            final MediaPlayer a_1365 = MediaPlayer.create(getApplicationContext(),R.raw.a_1365);
                            a_1365.start();
                            break;
                        case R.id.b_390:
                            final MediaPlayer a_390 = MediaPlayer.create(getApplicationContext(),R.raw.a_390);
                            a_390.start();
                            break;
                        case R.id.b_30020:
                            final MediaPlayer a_30020 = MediaPlayer.create(getApplicationContext(),R.raw.a_30020);
                            a_30020.start();
                            break;
                        case R.id.b_3003:
                            final MediaPlayer a_3003 = MediaPlayer.create(getApplicationContext(),R.raw.a_3003);
                            a_3003.start();
                            break;
                        case R.id.b_1155:
                            final MediaPlayer a_1155 = MediaPlayer.create(getApplicationContext(),R.raw.a_1155);
                            a_1155.start();
                            break;
                        case R.id.b_546:
                            final MediaPlayer a_546 = MediaPlayer.create(getApplicationContext(),R.raw.a_546);
                            a_546.start();
                            break;
                        case R.id.b_42:
                            final MediaPlayer a_42 = MediaPlayer.create(getApplicationContext(),R.raw.a_42);
                            a_42.start();
                            break;
                        case R.id.b_2145:
                            final MediaPlayer a_2145 = MediaPlayer.create(getApplicationContext(),R.raw.a_2145);
                            a_2145.start();
                            break;
                        case R.id.b_462:
                            final MediaPlayer a_462 = MediaPlayer.create(getApplicationContext(),R.raw.a_462);
                            a_462.start();
                            break;
                        case R.id.b_330:
                            final MediaPlayer a_330 = MediaPlayer.create(getApplicationContext(),R.raw.a_330);
                            a_330.start();
                            break;
                        case R.id.b_385:
                            final MediaPlayer a_385 = MediaPlayer.create(getApplicationContext(),R.raw.a_385);
                            a_385.start();
                            break;
                        case R.id.b_10:
                            final MediaPlayer a_10 = MediaPlayer.create(getApplicationContext(),R.raw.a_10);
                            a_10.start();
                            break;
                        case R.id.b_21:
                            final MediaPlayer a_21 = MediaPlayer.create(getApplicationContext(),R.raw.a_21);
                            a_21.start();
                            break;
                        case R.id.b_66:
                            final MediaPlayer a_66= MediaPlayer.create(getApplicationContext(),R.raw.a_66);
                            a_66.start();
                            break;
                        case R.id.b_6006:
                            final MediaPlayer a_6006 = MediaPlayer.create(getApplicationContext(),R.raw.a_6006);
                            a_6006.start();
                            break;
                        case R.id.b_770:
                            final MediaPlayer a_770 = MediaPlayer.create(getApplicationContext(),R.raw.a_770);
                            a_770.start();
                            break;
                        case R.id.b_110:
                            final MediaPlayer a_110 = MediaPlayer.create(getApplicationContext(),R.raw.a_110);
                            a_110.start();
                            break;
                        case R.id.b_1430:
                            final MediaPlayer a_1430 = MediaPlayer.create(getApplicationContext(),R.raw.a_1430);
                            a_1430.start();
                            break;
                        case R.id.b_78:
                            final MediaPlayer a_78 = MediaPlayer.create(getApplicationContext(),R.raw.a_78);
                            a_78.start();
                            break;
                        case R.id.b_4290:
                            final MediaPlayer a_4290 = MediaPlayer.create(getApplicationContext(),R.raw.a_4290);
                            a_4290.start();
                            break;
                        case R.id.b_165:
                            final MediaPlayer a_165 = MediaPlayer.create(getApplicationContext(),R.raw.a_165);
                            a_165.start();
                            break;
                        case R.id.b_70:
                            final MediaPlayer a_70 = MediaPlayer.create(getApplicationContext(),R.raw.a_70);
                            a_70.start();
                            break;
                        case R.id.b_2310:
                            final MediaPlayer a_2310 = MediaPlayer.create(getApplicationContext(),R.raw.a_2310);
                            a_2310.start();
                            break;
                        case R.id.b_182:
                            final MediaPlayer a_182 = MediaPlayer.create(getApplicationContext(),R.raw.a_182);
                            a_182.start();
                            break;

                    }
                    return false;
                }
            });
        }



        for (n=0; n<idArray.length;n++) {
            button[ n ] = (Button) findViewById(idArray[ n ]);
            final Intent i = new Intent(LearnActivity.this, learn2.class);
            final Intent newintent = new Intent(LearnActivity.this, learn2.class);
            button[ n ].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch (view.getId()) {
                        case R.id.b_2:
                            i.putExtra("intVariableName1", 2);
                            i.putExtra("intVariableName2", 1);
                            i.putExtra("intVariableName3", 1);
                            i.putExtra("intVariableName4", 1);
                            startActivity(i);
                            break;
                        case R.id.b_231:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 7);
                            i.putExtra("intVariableName3", 11);
                            i.putExtra("intVariableName4", 1);
                            startActivity(i);
                            break;
                        case R.id.b_15:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 1);
                            i.putExtra("intVariableName4", 1);
                            startActivity(i);

                            break;
                        case R.id.b_77:
                            i.putExtra("intVariableName1", 7);
                            i.putExtra("intVariableName2", 11);
                            i.putExtra("intVariableName3", 1);
                            i.putExtra("intVariableName4", 1);
                            startActivity(i);

                            break;
                        case R.id.b_286:
                            i.putExtra("intVariableName1", 2);
                            i.putExtra("intVariableName2", 11);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);
                            startActivity(i);

                            break;
                        case R.id.b_910:
                            i.putExtra("intVariableName1", 2);
                            i.putExtra("intVariableName2", 15);
                            i.putExtra("intVariableName3", 7);
                            i.putExtra("intVariableName4", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_14:
                            i.putExtra("intVariableName1", 2);
                            i.putExtra("intVariableName2", 7);
                            i.putExtra("intVariableName3", 1);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_33:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 11);
                            i.putExtra("intVariableName3", 1);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_154:
                            i.putExtra("intVariableName1", 2);
                            i.putExtra("intVariableName2", 7);
                            i.putExtra("intVariableName3", 11);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_195:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_22:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_39:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);


                            break;
                        case R.id.b_210:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);


                            break;
                        case R.id.b_130:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);


                            break;
                        case R.id.b_429:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);


                            break;
                        case R.id.b_6:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_26:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_105:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_1001:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_35:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_15015:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_1365:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_390:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_30020:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_3003:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_1155:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_546:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_42:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_2145:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_462:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_330:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_385:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_10:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_21:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_66:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);
                            ;
                            break;
                        case R.id.b_6006:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_770:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_110:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_1430:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_78:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_4290:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_165:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_70:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_2310:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;
                        case R.id.b_182:
                            i.putExtra("intVariableName1", 3);
                            i.putExtra("intVariableName2", 5);
                            i.putExtra("intVariableName3", 13);
                            i.putExtra("intVariableName4", 1);

                            break;

                        }




                    }
                });
            }



        }



    }



