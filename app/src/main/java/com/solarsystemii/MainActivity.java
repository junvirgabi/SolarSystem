package com.solarsystemii;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.solarsystemii.R;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TypedArray planetpic;
    ImageView planet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        planetpic = getResource().obtainTypedArray(R.array.planets_pics);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            ImageView planet = (ImageView) findViewById(R.id.Planet);

                if(parent.getItemAtPosition(position).toString().equals("Mercury")){
                    planet.setImageResource(R.drawable.mercury);}
                else if (parent.getItemAtPosition(position).toString().equals("Venus")){
                    planet.setImageResource(R.drawable.venus);}
                else if (parent.getItemAtPosition(position).toString().equals("Earth")){
                    planet.setImageResource(R.drawable.earth);}
                else if (parent.getItemAtPosition(position).toString().equals("Mars")){
                    planet.setImageResource(R.drawable.mars);}
                else if (parent.getItemAtPosition(position).toString().equals("Jupiter")){
                    planet.setImageResource(R.drawable.jupiter);}
                else if (parent.getItemAtPosition(position).toString().equals("Saturn")){
                    planet.setImageResource(R.drawable.saturn);}
                else if (parent.getItemAtPosition(position).toString().equals("Uranus")){
                    planet.setImageResource(R.drawable.neptune);}

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
