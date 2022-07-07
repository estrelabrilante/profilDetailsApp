package com.example.fragmenttoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name,email;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //added fragment into main activity
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        personalDetailsFragment personalDetailsFragment = new personalDetailsFragment();
       fragmentTransaction.add(R.id.linearMain,personalDetailsFragment);
       fragmentTransaction.commit();

    }

    public void takeData( String userName, String userEmail ) {
        name = (TextView) findViewById(R.id.textViewName);
        email = (TextView) findViewById(R.id.textViewEmail);
         name.setText(" Hi "+ userName);
         email.setText("Saved your email address in our records as :" + userEmail);
    }
}