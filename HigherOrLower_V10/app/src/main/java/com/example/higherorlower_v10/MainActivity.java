package com.example.higherorlower_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int randomNumber;


    public void guess(View view)
    {
        EditText enterednumber=(EditText)findViewById(R.id.inputno);
        int guessno=Integer.parseInt(enterednumber.getText().toString());
        if(guessno>randomNumber)
        {
            Toast.makeText(this,"Lower!",Toast.LENGTH_SHORT).show();
        }
        if(guessno<randomNumber)
        {
            Toast.makeText(this,"Higher!",Toast.LENGTH_SHORT).show();
        }
        if(guessno==randomNumber)
        {
            Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show();
        }
        Log.i("Info",Integer.toString(randomNumber));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumber=(int)(Math.random()*19+1);
    }
}
