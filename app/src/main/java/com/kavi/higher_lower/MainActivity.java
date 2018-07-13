package com.kavi.higher_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);


        Random random = new Random();
        final int n = random.nextInt(20) + 1;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText) findViewById(R.id.editText);

                int guess = Integer.parseInt(text.getText().toString());

                if ( guess < n){
                    makeToast("Higher");

                }
                else if (guess > n){
                    makeToast("Lower");
                }
                else {
                    makeToast("That Right");
                    Random random = new Random();
                    int n = random.nextInt(20) + 1;


                }
            }
        });
    }

    public void makeToast(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
