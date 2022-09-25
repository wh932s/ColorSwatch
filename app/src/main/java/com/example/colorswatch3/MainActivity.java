package com.example.colorswatch3;

import static android.view.Gravity.CENTER;
import static android.widget.LinearLayout.VERTICAL;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


    public class MainActivity extends AppCompatActivity {
        LinearLayout linearLayout;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);






//Finding layouts, calling IDs, and setting layouts
            LinearLayout l_layout = (LinearLayout) findViewById(R.id.linearLayout);

            LinearLayout l_layout2 = (LinearLayout) findViewById(R.id.linearLayout);
            l_layout.setBackgroundColor(l_layout.getContext().getResources().getColor(R.color.brown));

            l_layout.setOrientation(VERTICAL); // or HORIZONTAL

            l_layout2.setOrientation(VERTICAL); // or HORIZONTAL




            //First Button and Text
            Button btn1 = new Button(this);
            btn1.setText("PLUM");

            //Setting Text size, Height of button1, and background color
            btn1.setTextSize(25);
            btn1.setHeight(250);
            btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.darkbrown));

            //Setting new linearlayout and creating margin for the button
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            params.setMargins(0,70,0,30);
            btn1.setLayoutParams(params);





            //Second Button and Text
            Button btn2 = new Button(this);
            btn2.setText("BLUE");


            
            //Setting Text size, Height of button1,  and background color
            btn2.setTextSize(25);
            btn2.setHeight(250);
            btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.darkbrown));



            //Setting new linearlayout and creating margin for the button
            LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            params2.setMargins(0,10,0,30);
            btn2.setLayoutParams(params2);








            //Third Button and Text
            Button btn3 = new Button(this);
            btn3.setText("GOLD");




            //Setting Text size, Height of button1, and background color
            btn3.setTextSize(25);
            btn3.setHeight(250);
            btn3.setBackgroundColor(btn3.getContext().getResources().getColor(R.color.darkbrown));



            //Setting new linearlayout and creating margin for the button
            LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            params3.setMargins(0,10,0,30);
            btn3.setLayoutParams(params3);



//Adding buttons to layout
            l_layout.addView(btn1);

            l_layout.addView(btn2);

            l_layout.addView(btn3);



//Adding TextView to layout
            TextView tv = new TextView(getApplicationContext());



//Style for the TextView
            tv.setGravity(CENTER);
            tv.setVisibility(View.INVISIBLE);
            tv.setBackgroundColor(tv.getContext().getResources().getColor(R.color.darkbrown));
            LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            params4.setMargins(0,70,0,30);
            tv.setLayoutParams(params4);
            tv.setText("Pick a Color...");
            tv.setHeight(650);
            tv.setPadding(20,20,20,20);
            tv.setTextColor(tv.getContext().getResources().getColor(R.color.black));
            tv.setTextSize(25);

            l_layout2.addView(tv);



            btn1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tv.setText(R.string.plumb_is);
                            tv.setVisibility(View.VISIBLE);
                        }
                    });

            btn2.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        tv.setText(R.string.blue_is);
                            tv.setVisibility(View.VISIBLE);
                        }
                    });

            btn3.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                        tv.setText(R.string.gold_is);
                            tv.setVisibility(View.VISIBLE);
                        }
                    });
        }

    }







//
//        gridLayout = findViewById(R.id.gridLayout);
//
//        Button button = new Button(this);
//        button.setText("PLUM");
//        button.setBackgroundColor(button.getContext().getResources().getColor(R.color.darkbrown));
//        button.setLayoutParams(new
//                ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        Button button2 = new Button(this);
//        button2.setText("NEW");
//        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.darkbrown));
//
//
//        Button button3 = new Button(this);
//        button3.setText("New2");
//        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.darkbrown));
//
//
//        if (gridLayout != null) {
//            gridLayout.addView(button);
//            gridLayout.addView(button2);
//            gridLayout.addView(button3);
//        }











