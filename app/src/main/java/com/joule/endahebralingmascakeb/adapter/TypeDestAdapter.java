package com.joule.endahebralingmascakeb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelDestination;

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
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelDestinations.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
