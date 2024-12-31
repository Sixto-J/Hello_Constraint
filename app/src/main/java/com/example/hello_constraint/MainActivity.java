package com.example.hello_constraint;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button btnEnviar1 = findViewById(R.id.button);

        btnEnviar1.setOnClickListener(v -> {
            // código a ejecutar cuando sea pulsado
            TextView tv1 = findViewById(R.id.textView);
            String text = tv1.getText().toString();
            Toast.makeText(MainActivity.this, "TU PUNTUACION ES " + text, Toast.LENGTH_SHORT).show();
        });

        Button btnEnviar2 = findViewById(R.id.button2);
        btnEnviar2.setOnClickListener(v -> {
            // código a ejecutar cuando sea pulsado
            TextView tv1 = findViewById(R.id.textView);
            String aux_string = tv1.getText().toString();
            int numerodecontador = Integer.parseInt(aux_string);
            //.replaceAll("[\\D]", ""));
            numerodecontador++;
            tv1.setText(String.valueOf(numerodecontador));
        });
    }


    private static final String STATE_COUNTER = "counter";
    int mCounter;
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save our own state now
        outState.putInt(STATE_COUNTER, mCounter);
    }

}


// android:configChanges="orientation|screenSize|screenLayout"

