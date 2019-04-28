package com.josehinojo.zooverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    String poster;
    AnimalModel model;
    private Context mContext;


    ArrayList<AnimalModel> animalList = new ArrayList<>();


    AnimalModel animal1 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal2 = new AnimalModel(R.drawable.tigermap);
    AnimalModel animal3 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal4 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal5 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal6 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal7 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal8 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal9 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal10 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal11 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal12 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal13 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal14 = new AnimalModel(R.drawable.tiger);
    AnimalModel animal15 = new AnimalModel(R.drawable.tiger);

    public void loadData() {

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
        animalList.add(animal6);
        animalList.add(animal7);
        animalList.add(animal8);
        animalList.add(animal9);
        animalList.add(animal10);
        animalList.add(animal11);
        animalList.add(animal12);
        animalList.add(animal13);
        animalList.add(animal14);
        animalList.add(animal15);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemImage.setImageResource(Integer.parseInt(String.valueOf(animalList.get(i).getTiger())));

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;


        public ViewHolder(View itemView) {
            super(itemView);
            loadData();
            itemImage =
                    (ImageView) itemView.findViewById(R.id.item_image);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Snackbar.make(v, "Employee: " + animalList.get(position),
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();


                }
            });

        }
    }

}
