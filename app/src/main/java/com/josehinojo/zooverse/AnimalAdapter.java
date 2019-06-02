package com.josehinojo.zooverse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

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

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView animalName;


        public ViewHolder(View itemView) {
            super(itemView);

            animalName = itemView.findViewById(R.id.animalName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int clickedPosition = getAdapterPosition();
                    Animal clickedItem = animalList.get(clickedPosition);
                    Intent intent = new Intent(mContext, DetailActivity.class);

//intent.putExtra("itemclick", clickedItem);
                    mContext.startActivity(intent);
                }
            });

        }
    }

}
