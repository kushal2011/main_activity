package com.example.kusha_000.gtustudymaterialscse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.SemList, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        
        // Add second spinner listner here
        spinner2.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        
        
        
    // Check which spinner is clicked    
        
     Spinner SpinnerSel = (Spinner) parent;
     if(SpinnerSel.getId() == R.id.spinner)
     {
         
         // Code for first spinner click
         
        String sp1= String.valueOf(spinner.getSelectedItem());
        TextView MyText=(TextView)view;
        Toast.makeText(this,"select subject from "+MyText.getText(),Toast.LENGTH_SHORT).show();


        if(sp1.contentEquals("3rd sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem3, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
           // spinner2.setOnItemSelectedListener(this);
        }
        else if(sp1.contentEquals("4th sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem4, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
            // spinner2.setOnItemSelectedListener(this);
        }
        else if(sp1.contentEquals("5th sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem5, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
            // spinner2.setOnItemSelectedListener(this);
        }
        else if(sp1.contentEquals("6th sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem6, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
        }
        else if(sp1.contentEquals("7th sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem7, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
        }
        else if(sp1.contentEquals("8th sem")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Sem8, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
        }
        else if(sp1.contentEquals("1st year")) {
            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.year1, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            adapter2.notifyDataSetChanged();
            spinner2.setAdapter(adapter2);
        }    
     }
     else if(SpinnerSel.getId() == R.id.spinner2)
     {
       // Write code for second spinner click here inside
     }
       

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }




}
