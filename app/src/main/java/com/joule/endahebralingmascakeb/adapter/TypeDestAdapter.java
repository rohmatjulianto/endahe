package com.joule.endahebralingmascakeb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.ui.DetailDestActivity;

import java.util.ArrayList;

public class TypeDestAdapter extends RecyclerView.Adapter<TypeDestAdapter.viewHolder> {

    Context context;
    ArrayList<ModelDestination> modelDestinations;

    public TypeDestAdapter(Context context, ArrayList<ModelDestination> modelDestinations) {
        this.context = context;
        this.modelDestinations = modelDestinations;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_typedest, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        holder.tvdest.setText(modelDestinations.get(position).getName());
        Glide.with(context)
                .load(modelDestinations.get(position).getImage())
                .into(holder.imgdest);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailDestActivity.class);
                intent.putExtra(DetailDestActivity.EXTRA_DATA, modelDestinations.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelDestinations.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        private ImageView imgdest;
        private TextView tvdest;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgdest = itemView.findViewById(R.id.img_typedest);
            tvdest = itemView.findViewById(R.id.tv_name_typedest);
            cardView = itemView.findViewById(R.id.cardTypeDest);
        }
    }
}
