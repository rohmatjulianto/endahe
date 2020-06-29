package com.joule.endahebralingmascakeb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelEvent;
import com.joule.endahebralingmascakeb.source.DetailEventActivity;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.viewHolder> {
    Context context;
    ArrayList<ModelEvent> modelEvent;

    public EventAdapter(Context context, ArrayList<ModelEvent> modelEvent) {
        this.context = context;
        this.modelEvent = modelEvent;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event_btn, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        holder.bind(modelEvent.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailEventActivity.class);
                intent.putExtra(DetailEventActivity.EXTRA, modelEvent.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelEvent.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_logo);
            tvName = itemView.findViewById(R.id.tv_name);
        }

        public void bind(ModelEvent modelEvent) {
            Glide.with(context)
                    .load(modelEvent.getCover())
                    .centerCrop()
                    .into(imageView);
            tvName.setText(modelEvent.getName());
        }
    }
}
