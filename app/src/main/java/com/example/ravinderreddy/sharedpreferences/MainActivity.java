package com.example.ravinderreddy.sharedpreferences;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.submit);
        button.setOnClickListener(this);
        BlankFragment  blankFragment=new BlankFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_layout,blankFragment);
        fragmentTransaction.addToBackStack("Blankfragment");
        fragmentTransaction.commit();


    }

    @Override
    public void onClick(View v) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_layout,new SecondFragment());
        fragmentTransaction.addToBackStack("Blankfragment");
        fragmentTransaction.commit();


    }
}
