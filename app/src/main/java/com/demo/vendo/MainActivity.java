package com.demo.vendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = findViewById(R.id.button5);
        ImageButton cokeButton = findViewById(R.id.coke);
        ImageButton spriteButton = findViewById(R.id.sprite);
        ImageButton fantaButton = findViewById(R.id.fanta);
        ImageButton pepsiButton = findViewById(R.id.pepsi);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when button is clicked
                EditText inputText = findViewById(R.id.editTextNumber);
                String text = inputText.getText().toString();
                String inputAmount = text;
                int convertedAmount = Integer.valueOf(inputAmount);
                if (!inputAmount.isEmpty()) {
                    for (int i = 0; i < 5; i++) {
                        switch (i) {
                            case 1: {
                                if (convertedAmount >=10) {
                                    //Light Coke
                                    TextView coke = findViewById(R.id.cokeText);
                                    coke.setTextColor(Color.parseColor("#00FF00"));
                                    cokeButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            // Perform action when the ImageButton is clicked
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView) findViewById(R.id.cokePrice);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 1);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView coke = findViewById(R.id.cokeText);
                                    coke.setTextColor(Color.parseColor("#FF0000"));
                                }
                                break;
                            }
                            case 2: {
                                if (convertedAmount >=15) {
                                    //Light Sprite
                                    TextView sprite = findViewById(R.id.spriteText);
                                    sprite.setTextColor(Color.parseColor("#00FF00"));
                                    spriteButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            // Perform action when the ImageButton is clicked
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView) findViewById(R.id.spritePrice);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 2);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView coke = findViewById(R.id.spriteText);
                                    coke.setTextColor(Color.parseColor("#FF0000"));
                                }
                                break;
                            }
                            case 3: {
                                if (convertedAmount >=20) {
                                    //Light Fanta
                                    TextView fanta = findViewById(R.id.fantaText);
                                    fanta.setTextColor(Color.parseColor("#00FF00"));
                                    fantaButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            // Perform action when the ImageButton is clicked
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView) findViewById(R.id.fantaPrice);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 3);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView coke = findViewById(R.id.fantaText);
                                    coke.setTextColor(Color.parseColor("#FF0000"));
                                }
                                break;
                            }
                            case 4: {
                                if (convertedAmount >=25) {
                                    //Light Pepsi
                                    TextView pepsi = findViewById(R.id.pepsiText);
                                    pepsi.setTextColor(Color.parseColor("#00FF00"));
                                    pepsiButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            // Perform action when the ImageButton is clicked
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView) findViewById(R.id.pepsiPrice);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 4);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView coke = findViewById(R.id.pepsiText);
                                    coke.setTextColor(Color.parseColor("#FF0000"));
                                }
                                break;
                            }
                        }
                    }
                }
                ;
            }
        });
    }
}