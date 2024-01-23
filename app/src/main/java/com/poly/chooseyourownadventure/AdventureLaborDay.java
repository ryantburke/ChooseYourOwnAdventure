package com.poly.chooseyourownadventure;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdventureLaborDay extends AppCompatActivity {


    private TextView tvStoryTitle, tvOptionTitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStoryTitle = findViewById(R.id.tv_title1);
        tvOptionTitle = findViewById(R.id.tv_title2);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_option1);
        btn2 = findViewById(R.id.btn_option2);
        btn3 = findViewById(R.id.btn_option3);
        btn4 = findViewById(R.id.btn_option4);

        numLives = 4;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }


    public void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_title);


        tvOptionTitle.setText("HIGH SCHOOL EDITION");

        tvStoryText.setText("Its labor day, lets go! Mom knows its the most important day of the year for a a high schooler, so she loaded up the car with a full tank of gas and gave you the keys. The world is your oyster. Where would you like to go?");

        setAllBtnsVisible();
        btn1.setText("Go to the beach");
        btn2.setText("Go to the park");
        btn3.setText("Go to a restaurant");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBeach();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPark();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRestaurant();
            }
        });


    }

    //________BEACH PATH________
    private void goToBeach()
    {
        tvStoryText.setText("What would you like to do at the beach?");

        ivStory.setImageResource(R.drawable.im_beach);

        setAllBtnsVisible();
        btn1.setText("Go Swimming");
        btn2.setText("Lay out and tan");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 goSwimming();
             }
         });

         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 layOut();
             }
         });
    }


    private void goSwimming()
    {

        tvStoryText.setText("You see a shark, what do you do?");

        ivStory.setImageResource(R.drawable.im_swimming);

        setAllBtnsVisible();
        btn1.setText("Call the lifeguard");
        btn2.setText("Punch it in the nose");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLifeguard();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                punchShark();
            }
        });

    }

    private void callLifeguard()
    {

        isWon = true;
        tvStoryText.setText("The lifeguard saves you, you don't die, congrats.");

        ivStory.setImageResource(R.drawable.im_lifeguard_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    private void punchShark()
    {

        tvStoryText.setText("You punch the shark but injure you hand. You can't play football. Game over.");

        ivStory.setImageResource(R.drawable.im_punch_shark);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void layOut()
    {

        tvStoryText.setText("For how long?");

        ivStory.setImageResource(R.drawable.im_beach);

        setAllBtnsVisible();
        btn1.setText("20 minutes");
        btn2.setText("5 hours");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tan20Mins();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tan5Hours();
            }
        });
    }

    private void tan20Mins()
    {

        isWon = false;
        tvStoryText.setText("You are white. Might as well have stayed home. Game over.");

        ivStory.setImageResource(R.drawable.im_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void tan5Hours()
    {
        isWon = false;
        tvStoryText.setText("You are burned. Too much of a good thing is bad. Learn from this experience. Game over.");

        ivStory.setImageResource(R.drawable.im_tan5hours);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }

    //________PARK PATH________
    private void goToPark()
    {

        tvStoryText.setText("What would you like to do at the park?");

        ivStory.setImageResource(R.drawable.im_whaley_park);

        setAllBtnsVisible();
        btn1.setText("Go play soccer");
        btn2.setText("Go on the slide");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSoccer();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide();
            }
        });
    }

    private void playSoccer()
    {

        tvStoryText.setText("You see a baby, what do you do?");

        ivStory.setImageResource(R.drawable.im_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Call the mom");
        btn2.setText("Don't call the mom");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callMom();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontCallMom();
            }
        });
    }

    private void callMom()
    {

        isWon = true;
        tvStoryText.setText("The mom gives you the baby, you are a parent now, congrats. You win.");

        ivStory.setImageResource(R.drawable.im_take_baby);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void dontCallMom()
    {

        isWon = false;
        tvStoryText.setText("The baby cries, your team loses from distraction. Game over.");


        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });


    }

    private void slide()
    {

        isWon = false;
        tvStoryText.setText("Bad idea, its raining now. You can't play soccer. Game over.");

        ivStory.setImageResource(R.drawable.im_rain);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    //________RESTAURANT PATH________
    private void goToRestaurant()
    {
        double chance = Math.random();
        if (chance < 0.5)
        {
            isWon = true;
            tvStoryText.setText("You go to the restaurant. The food is very good. But you forgot your wallet. They totally understand, free meal, you win.");
            ivStory.setImageResource(R.drawable.im_free_meal);


        }
        else
        {
            isWon = false;
            tvStoryText.setText("You go to the restaurant. The food is aweful, you wasted your time and hard earned money\nGame over.");
            ivStory.setImageResource(R.drawable.im_bad_food);
        }

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("Its a labor day miracle! You get to live the whole day over again!");
        }
        else
        {
            numLives--;
            String text = "You wasted an entire year of high school. You have " + numLives + " years remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("High school is over. Permenant Game over.");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvStoryText.setText("Just kidding! Play again?");

                    btn1.setText("Of course!");

                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            start();
                        }
                    });
                }
            });
        }
    }


}
