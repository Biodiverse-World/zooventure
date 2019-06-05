package com.josehinojo.zooverse;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.josehinojo.zooverse.POJOS.Animal;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvScienceName;
    TextView tvHabitatEcology;
    TextView tvThreats;
    ImageView ivAnimalImages;


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

        ivAnimalImages = (ImageView) findViewById(R.id.iVDetailImage);

        detailAnimalImage();
    }

    public void detailAnimalImage() {
        String sAnimal;
        sAnimal = tvName.getText().toString();

        if (sAnimal.matches("vulture")) {
            Glide.with(this)
                    .load(R.drawable.hoodedvulture)
                    .into(ivAnimalImages);

        } else if (sAnimal.matches("African crocodile")) {
            Glide.with(this)
                    .load(R.drawable.nilecrocodile)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("macaw")) {
            Glide.with(this)
                    .load(R.drawable.hyacinthmacaw)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("hornbill")) {
            Glide.with(this)
                    .load(R.drawable.wreathedhornbill)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("flamingo")) {
            Glide.with(this)
                    .load(R.drawable.lesserflamingo)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("crane")) {
            Glide.with(this)
                    .load(R.drawable.redcrownedcrane)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("zebra")) {
            Glide.with(this)
                    .load(R.drawable.grevyszebra)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("gorilla")) {
            Glide.with(this)
                    .load(R.drawable.westerngorilla)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("common newt")) {
            Glide.with(this)
                    .load(R.drawable.blackspottednewt)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("axolotl")) {
            Glide.with(this)
                    .load(R.drawable.axolotl)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("Komodo dragon")) {
            Glide.with(this)
                    .load(R.drawable.komododragon)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("tarantula")) {
            Glide.with(this)
                    .load(R.drawable.peacocktarantula)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("tiger")) {
            Glide.with(this)
                    .load(R.drawable.sumatrantiger)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("hippopotamus")) {
            Glide.with(this)
                    .load(R.drawable.hippopotamus)
                    .into(ivAnimalImages);
        } else if (sAnimal.matches("otter")) {
            Glide.with(this)
                    .load(R.drawable.asiansmallclawedotter)
                    .into(ivAnimalImages);
        }
    }
}

