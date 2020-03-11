package com.joule.endahebralingmascakeb.adapter;
import android.content.Context;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.islamkhsh.CardSliderAdapter;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.model.ModelDestination;

import java.util.ArrayList;

public class SliderTopAdapter extends CardSliderAdapter<ModelDestination> {

    Context context;
    public SliderTopAdapter(Context context, ArrayList<ModelDestination> items) {
        super(items);
        this.context = context;
    }

    @Override
    public void bindView(int i, View itemView,  @Nullable ModelDestination modelDestinations) {
        ImageView imgSlider;
        TextView tvName, tvType;
        imgSlider = itemView.findViewById(R.id.img_slider);
        tvName = itemView.findViewById(R.id.tv_name_dest);
        tvType = itemView.findViewById(R.id.tv_type_dest);

        tvName.setText(modelDestinations.getCity());
        tvType.setText(modelDestinations.getName());
        Glide.with(context)
                .load(modelDestinations.getImage())
                .centerCrop()
                .into(imgSlider);
    }

    @Override
    public int getItemContentLayout(int i) {
        return R.layout.item_slider_top;
    }

}
