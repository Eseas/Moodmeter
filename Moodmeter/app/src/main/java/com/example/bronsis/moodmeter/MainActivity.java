package com.example.bronsis.moodmeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getName().equals("Max")) { //true
            System.out.println( "Java passes by value." );

        } else if (aDog.getName().equals("Fifi")) {
            System.out.println( "Java passes by reference." );
        }
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true

        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }

}
