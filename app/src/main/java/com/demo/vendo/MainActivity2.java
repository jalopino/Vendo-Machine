package com.demo.vendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button back = findViewById(R.id.back);
        TextView buyPrice = (TextView) findViewById(R.id.buyPrice);
        String price = getIntent().getStringExtra("price");
        buyPrice.setText(price);
        double doublePrice = Double.parseDouble(price);
        TextView changeAmount = (TextView) findViewById(R.id.change);
        String amount = getIntent().getStringExtra("amount");
        double doubleAmount = Double.parseDouble(amount);
        double change = doubleAmount - doublePrice;
        String stringChange = Double.toString(change);
        changeAmount.setText(stringChange);

        int image = getIntent().getIntExtra("image", 0);
        switch(image) {
            case 1: {
                ImageView imageView = findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.coke);
                break;
            }
            case 2: {
                ImageView imageView = findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.sprite);
                break;
            }
            case 3: {
                ImageView imageView = findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.fanta);
                break;
            }
            case 4: {
                ImageView imageView = findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.pepsi);
                break;
            }
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}