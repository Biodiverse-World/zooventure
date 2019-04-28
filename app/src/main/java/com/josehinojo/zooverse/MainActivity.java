package com.josehinojo.zooverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.josehinojo.zooverse.POJOS.Animal;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;

    FirebaseDatabase database;
    DatabaseReference zooReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        zooReference = database.getReference("animals");

        Animal animal = new Animal("white stork","habitat alteration, shortage of nesting sites, excessive use of pesticides, collision with and electrocution from overhead powerlines, hunted for food and sport","Bird",
                "https://www.iucnredlist.org/species/22697691/86248677","Ciconia ciconia"
        ,"Grassland, Artificial/Terrestrial","Europe, North Africa, Asia Minor, and the Middle East",
                "Least Concern","White Stork","BirdLife International 2016. Ciconia ciconia. The IUCN Red List of Threatened Species 2016: e.T22697691A86248677. http://dx.doi.org/10.2305/IUCN.UK.2016-3.RLTS.T22697691A86248677.en. Downloaded on 27 April 2019.");




        bottomAppBar = (BottomAppBar) findViewById(R.id.bottomApp);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.cameraFab);
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "stop", Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        setSupportActionBar(bottomAppBar);


        //shtopiahd;oaisjdf;ojsdf
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottommenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.books_menu:
                Intent intent = new Intent(this, DetailActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
