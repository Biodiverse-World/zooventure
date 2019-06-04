package com.josehinojo.zooverse;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.josehinojo.zooverse.POJOS.Animal;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvScienceName;
    TextView tvHabitatEcology;
    TextView tvThreats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Animal animal;

        animal = getIntent().getParcelableExtra("ANIMAL_KEY");

        tvName = (TextView) findViewById(R.id.animalName);
        tvName.setText(animal.getName());

        tvScienceName = (TextView) findViewById(R.id.scientificName);
        tvScienceName.setText(animal.getScientificName());

        tvHabitatEcology = (TextView) findViewById(R.id.habitatEcology);
        tvHabitatEcology.setText(animal.getHabitat());

        tvThreats = (TextView) findViewById(R.id.threats);
        tvThreats.setText(animal.getThreats());
    }
}
