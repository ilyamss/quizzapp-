package com.example.ilyamss.onlinequizapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ilyamss.onlinequizapp.Interface.ItemClickListner;
import com.example.ilyamss.onlinequizapp.R;

/**
 * Created by ilyamss on 30.05.2018.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView category_name;
    public ImageView category_image;

    private ItemClickListner itemClickListner;

    public CategoryViewHolder(View itemView) {

        super(itemView);
        category_image =(ImageView)itemView.findViewById(R.id.category_image);
        category_name =(TextView)itemView.findViewById(R.id.category_name);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListner = itemClickListner;
    }


    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }
}

