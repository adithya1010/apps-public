package com.example.currency_converter_ver10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   public void convertCurrency(View view)
   {
       Log.i("Info","Button pressed");
       EditText editText=(EditText)findViewById(R.id.editText);
       String amountindollars=editText.getText().toString();
       double dollars=Double.parseDouble(amountindollars);
       double rupees=dollars*65;
       String rupeesstring=Double.toString(rupees);
       Toast.makeText(this,"Amount in rupees:"+rupeesstring,Toast.LENGTH_LONG).show();
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
