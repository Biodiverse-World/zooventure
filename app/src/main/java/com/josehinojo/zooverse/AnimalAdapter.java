package com.josehinojo.zooverse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    String poster;
    AnimalModel model;
    private Context mContext;
    private List<AnimalModel> animalList;


    public AnimalAdapter(Context mContext, List<AnimalModel> satelliteList) {

        this.mContext = mContext;
        this.animalList = satelliteList;
    }


    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }


    @Override
    public void onBindViewHolder(final AnimalAdapter.ViewHolder holder, int position) {

        AnimalModel recordEntries = animalList.get(position);

        //String poster = recordEntries.url;

       /* RequestOptions options = new RequestOptions()
                .override(Target.SIZE_ORIGINAL)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .priority(Priority.HIGH);

        Glide.with(mContext)
                .load(poster)
                .transition(withCrossFade())
                .apply(options)
                .into(holder.posterthumbnail);*/
    }


    @Override
    public int getItemCount() {
        if (animalList == null) {
            return 0;
        }
        return animalList.size();
    }

    public List<AnimalModel> getRecords() {
        return animalList;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView posterthumbnail;

        public ViewHolder(View itemView) {
            super(itemView);

            posterthumbnail = (ImageView) itemView.findViewById(R.id.rv_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int clickedPosition = getAdapterPosition();
                    AnimalModel clickedItem = animalList.get(clickedPosition);

                    Intent intent = new Intent(mContext, DetailActivity.class);
                    /*intent.putExtra("passedLat", clickedItem.getLatitude());
                    intent.putExtra("passedLong", clickedItem.getLongitude());
                    intent.putExtra("passedDate", clickedItem.getDate());
                    intent.putExtra("passedImage", clickedItem.getUrl());
                    intent.putExtra("passedTitle", clickedItem.getTitle());
                    intent.putExtra("landsatParcel", clickedItem);*/


                    mContext.startActivity(intent);
                }
            });
        }
    }

    //public void setRecords(List<animalList> recordEntries) {
    //animalList = recordEntries;
    //notifyDataSetChanged();
}


