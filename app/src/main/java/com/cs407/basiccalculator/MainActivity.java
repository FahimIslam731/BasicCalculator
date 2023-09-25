package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        Log.i("Hello", "Hello");
        String str1 = ((EditText) (findViewById(R.id.num1))).getText().toString();
        String str2 = ((EditText) (findViewById(R.id.num2))).getText().toString();
        String msg = "";

        int num1, num2;

        try{
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            int res = num1 + num2;
            msg = res + "";
        } catch(NumberFormatException nfe){
            msg = "Integers were not entered in one or more text fields.";
        }

        goToActivity(msg);
    }

    public void subtract(View view){
        String str1 = ((EditText) (findViewById(R.id.num1))).getText().toString();
        String str2 = ((EditText) (findViewById(R.id.num2))).getText().toString();
        String msg = "";

        int num1, num2;

        try{
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            int res = num1 - num2;
            msg = res + "";
        } catch(NumberFormatException nfe){
            msg = "Integers were not entered in one or more text fields.";
        }

        goToActivity(msg);
    }

    public void multiply(View view){
        String str1 = ((EditText) (findViewById(R.id.num1))).getText().toString();
        String str2 = ((EditText) (findViewById(R.id.num2))).getText().toString();
        String msg = "";

        int num1, num2;

        try{
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            int res = num1 * num2;
            msg = res + "";
        } catch(NumberFormatException nfe){
            msg = "Integers were not entered in one or more text fields.";
        }

        goToActivity(msg);
    }

    public void divide(View view){
        String str1 = ((EditText) (findViewById(R.id.num1))).getText().toString();
        String str2 = ((EditText) (findViewById(R.id.num2))).getText().toString();
        String msg = "";

        int num1, num2;

        try{
            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
            int res = num1/num2;
            msg = res + "";
        } catch(NumberFormatException nfe){
            msg = "Integers were not entered in one or more text fields.";
        } catch(ArithmeticException ae){
            msg = "Divisor cannot be 0.";
        }

        goToActivity(msg);
    }


//    public void clickFunction(View view) {
//        EditText et = (EditText) (findViewById(R.id.myTextField));
//
//        Toast.makeText(MainActivity.this, et.getText().toString(), Toast.LENGTH_LONG).show();
//        //Log.i("INFO", "Button Pressed");
//        goToActivity(et.getText().toString());
//    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}