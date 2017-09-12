package com.predator.movietype;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

         public void rbSelected(View view) {

        RadioButton horror = (RadioButton) findViewById(R.id.rb_h);
        RadioButton comedy = (RadioButton) findViewById(R.id.rb_c);
        RadioButton thriller = (RadioButton) findViewById(R.id.rb_t);
        RadioButton sci_fi = (RadioButton) findViewById(R.id.rb_s);
        RadioButton romantic = (RadioButton) findViewById(R.id.rb_r);


        if (horror.isChecked()) {
            Intent intent_horror = new Intent(MainActivity.this, HorrorActivity.class);
            startActivity(intent_horror);
        } else if (comedy.isChecked()) {
            Intent intent_comedy = new Intent(MainActivity.this, ComedyActivity.class);
            startActivity(intent_comedy);
        }
        else if (thriller.isChecked()){
            Intent intent_thriller = new Intent(MainActivity.this, ThrillerActivity.class);
            startActivity(intent_thriller);
        }
        else if(sci_fi.isChecked()){
            Intent intent_sci = new Intent(MainActivity.this, SciActivity.class);
            startActivity(intent_sci);
        }
        else if(romantic.isChecked()){
            Intent intent_romantic = new Intent(MainActivity.this, RomanticActivity.class);
            startActivity(intent_romantic);
        }



    }

}
