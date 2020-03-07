package com.joule.endahebralingmascakeb.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.islamkhsh.CardSliderViewPager;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.BtnAdapter;
import com.joule.endahebralingmascakeb.adapter.NearestAdapter;
import com.joule.endahebralingmascakeb.adapter.PopularAdapter;
import com.joule.endahebralingmascakeb.adapter.SliderTopAdapter;
import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.source.DummyData;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rvBtn;
    ArrayList<ModelBtn> modelBtn = new ArrayList<>();

    CardSliderViewPager sliderTopViewPager;
    ArrayList<ModelDestination> dataTopSlider = new ArrayList<>();

    RecyclerView rvNear;

    RecyclerView rvPop;

    public HomeFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderTopViewPager = view.findViewById(R.id.sliderTopViewPager);
        dataTopSlider.addAll(DummyData.getDataSliderTop());
        sliderTopViewPager.setAdapter(new SliderTopAdapter(getActivity(), dataTopSlider));

        rvBtn = view.findViewById(R.id.rv_btn);
        rvBtn.hasFixedSize();
        rvBtn.setNestedScrollingEnabled(false);
        modelBtn.addAll(DummyData.getDataBtn());
        rvBtn.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        BtnAdapter btnAdapter = new BtnAdapter(getActivity(),modelBtn);
        rvBtn.setAdapter(btnAdapter);

        rvNear = view.findViewById(R.id.rv_near);
        rvNear.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rvNear.setLayoutManager(linearLayoutManager);
        NearestAdapter nearestAdapter = new NearestAdapter(getActivity(), dataTopSlider);
        rvNear.setAdapter(nearestAdapter);

        rvPop = view.findViewById(R.id.rv_pop);
        rvPop.setLayoutManager(new GridLayoutManager(getActivity(),2));
        PopularAdapter popularAdapter = new PopularAdapter(getActivity(), dataTopSlider);
        rvPop.setAdapter(popularAdapter);

        return view;
    }
}
