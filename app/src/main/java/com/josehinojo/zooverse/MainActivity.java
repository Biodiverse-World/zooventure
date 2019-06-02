package com.josehinojo.zooverse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.josehinojo.zooverse.POJOS.Animal;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    FirebaseDatabase database;
    DatabaseReference zooReference;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    ArrayList<Animal> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_numbers);

        database = FirebaseDatabase.getInstance();
        zooReference = database.getReference("Animals");
        adapter = new AnimalAdapter(this, animalList);
        recyclerView.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        zooReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    Animal animal = snapshot.getValue(Animal.class);
                    animalList.add(animal);
                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



     /*   if (getApplicationContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            layoutManager = new GridLayoutManager(this, 1);
            recyclerView.setLayoutManager(layoutManager);
            adapter.notifyDataSetChanged();
        } else if (getApplicationContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            layoutManager = new GridLayoutManager(this, 2);
            recyclerView.setLayoutManager(layoutManager);
           adapter.notifyDataSetChanged();
        }*/


        recyclerView.setItemAnimator(new DefaultItemAnimator());



        

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
