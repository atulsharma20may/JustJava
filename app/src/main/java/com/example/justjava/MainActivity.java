package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view) {
        EditText numberOfCoffeeTextView = findViewById(R.id.noOfCoffee);
        TextView priceTextView = findViewById(R.id.textView3);

        int numberOfCoffee = Integer.parseInt(numberOfCoffeeTextView.getText().toString());

        double Amount = numberOfCoffee * 30;
        String AmountToShow = Amount + "";
        priceTextView.setText(AmountToShow);
    }
}