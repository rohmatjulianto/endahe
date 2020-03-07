package com.joule.endahebralingmascakeb.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.ui.DetailCityActivity;

import java.util.ArrayList;

public class BtnAdapter extends RecyclerView.Adapter<BtnAdapter.viewHolder> {

    Context context;
    ArrayList<ModelBtn> dataBtn;

    public BtnAdapter(Context context, ArrayList<ModelBtn> dataBtn) {
        this.context = context;
        this.dataBtn = dataBtn;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_btn, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        holder.textView.setText(dataBtn.get(position).getName());
        Glide.with(context)
                .load(dataBtn.get(position).getImage())
                .apply(new RequestOptions().override(100,120))
                .into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailCityActivity.class);
                intent.putExtra(DetailCityActivity.EXTRA_CITY, dataBtn.get(position));
                context.startActivity(intent);
                Log.d("yy", "onClick: ");
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBtn.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_logo);
            textView = itemView.findViewById(R.id.tv_name);
            cardView = itemView.findViewById(R.id.cardBtn);
        }
    }
}
