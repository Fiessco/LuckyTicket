package com.example.lackyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private Button btnCheckTicket;
    private EditText editTicketNumber;

    private  Algorithm algorithm = new Algorithm();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);
        btnCheckTicket = findViewById(R.id.btnCheckTicket);
        editTicketNumber = findViewById(R.id.editTicketNumber);

        btnCheckTicket.setOnClickListener(listener);

            }

    private View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
           String number = editTicketNumber.getText().toString();
           if (algorithm.isLuckyTicket(number)) {
               txtResult.setText("Этот билет счастливый!");
           } else {
               int newHappyNumber = algorithm.nextLuckyInt(number);
               txtResult.setText("Новый счастливый билет: " + newHappyNumber);
           }
        }
    };
}