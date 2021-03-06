package com.joule.endahebralingmascakeb.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.EventAdapter;
import com.joule.endahebralingmascakeb.source.DummyEvent;

/**
 * A simple {@link Fragment} subclass.
 */
public class TraditionalEvent extends Fragment {

    public TraditionalEvent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_traditional_event, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_btn_trad);
        EventAdapter eventAdapter = new EventAdapter(getActivity(), DummyEvent.getDataBtn());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(eventAdapter);

        return view;
    }
}
