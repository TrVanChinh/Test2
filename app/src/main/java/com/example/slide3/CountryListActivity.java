package com.example.slide3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CountryListActivity extends AppCompatActivity {
    private ListView lvCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        lvCountries = findViewById(R.id.lvCountries);

        String[] countries = new String[]{ "Viet Nam", "USA", "Japan", "Lao", "ThaiLand","Taiwan", "China", "Korea" };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        lvCountries.setAdapter(adapter);

        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(CountryListActivity.this,"Selected Country: " + countries[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}ss