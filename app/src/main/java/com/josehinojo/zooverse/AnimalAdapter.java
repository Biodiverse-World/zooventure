package com.josehinojo.zooverse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.josehinojo.zooverse.POJOS.Animal;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    String poster;
    private Context mContext;
    ArrayList<Animal> animalList;

    public AnimalAdapter(Context mContext, ArrayList<Animal> animalList) {
        this.animalList = animalList;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.animalName.setText(animalList.get(i).getName());

        if (i == 0) {

            Glide.with(mContext)
                    .load(R.drawable.hoodedvulture)
                    .into(viewHolder.imageView);

        } else if (i == 1) {
            Glide.with(mContext)
                    .load(R.drawable.nilecrocodile)
                    .into(viewHolder.imageView);
        } else if (i == 2) {
            Glide.with(mContext)
                    .load(R.drawable.hyacinthmacaw)
                    .into(viewHolder.imageView);
        } else if (i == 3) {
            Glide.with(mContext)
                    .load(R.drawable.wreathedhornbill)
                    .into(viewHolder.imageView);
        } else if (i == 4) {
            Glide.with(mContext)
                    .load(R.drawable.lesserflamingo)
                    .into(viewHolder.imageView);
        } else if (i == 5) {
            Glide.with(mContext)
                    .load(R.drawable.redcrownedcrane)
                    .into(viewHolder.imageView);
        } else if (i == 6) {
            Glide.with(mContext)
                    .load(R.drawable.grevyszebra)
                    .into(viewHolder.imageView);
        } else if (i == 7) {
            Glide.with(mContext)
                    .load(R.drawable.westerngorilla)
                    .into(viewHolder.imageView);
        } else if (i == 8) {
            Glide.with(mContext)
                    .load(R.drawable.blackspottednewt)
                    .into(viewHolder.imageView);
        } else if (i == 9) {
            Glide.with(mContext)
                    .load(R.drawable.axolotl)
                    .into(viewHolder.imageView);
        } else if (i == 10) {
            Glide.with(mContext)
                    .load(R.drawable.komododragon)
                    .into(viewHolder.imageView);
        } else if (i == 11) {
            Glide.with(mContext)
                    .load(R.drawable.peacocktarantula)
                    .into(viewHolder.imageView);
        } else if (i == 12) {
            Glide.with(mContext)
                    .load(R.drawable.sumatrantiger)
                    .into(viewHolder.imageView);
        } else if (i == 13) {
            Glide.with(mContext)
                    .load(R.drawable.hippopotamus)
                    .into(viewHolder.imageView);
        } else if (i == 14) {
            Glide.with(mContext)
                    .load(R.drawable.asiansmallclawedotter)
                    .into(viewHolder.imageView);
        }

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView animalName;
        public ImageView imageView;


        public ViewHolder(View itemView) {
            super(itemView);

            animalName = itemView.findViewById(R.id.animalName);
            imageView = itemView.findViewById(R.id.animalImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int clickedPosition = getAdapterPosition();
                    Animal clickedItem = animalList.get(clickedPosition);
                    Intent intent = new Intent(mContext, DetailActivity.class);
                    intent.putExtra("ANIMAL_KEY", clickedItem);
                    mContext.startActivity(intent);
                }
            });

        }
    }


}
