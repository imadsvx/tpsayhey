package com.example.tp1_sayhey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button heyButton = findViewById(R.id.buttonSayHey);
        final TextView  TextViewDisplay = findViewById(R.id.textViewQst);
        final EditText EditTextName = findViewById(R.id.editTextName);

        heyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = EditTextName.getText().toString();
                TextViewDisplay.setText("Hello " + name);
                EditTextName.setText("");
            }
        });
    }
}