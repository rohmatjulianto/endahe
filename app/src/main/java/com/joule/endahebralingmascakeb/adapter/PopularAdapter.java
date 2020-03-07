package com.joule.endahebralingmascakeb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.viewHolder> {
    Context context;
    ArrayList<ModelDestination> modelDestinations;

    public PopularAdapter(Context context, ArrayList<ModelDestination> modelDestinations) {
        this.context = context;
        this.modelDestinations = modelDestinations;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pop, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textView.setText(modelDestinations.get(position).getName());
        Glide.with(context)
                .load(modelDestinations.get(position).getImage())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return modelDestinations.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_pop);
            textView = itemView.findViewById(R.id.tv_name_pop);
        }
    }
}
