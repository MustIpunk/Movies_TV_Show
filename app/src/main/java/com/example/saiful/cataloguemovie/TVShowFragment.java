package com.example.saiful.cataloguemovie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.saiful.cataloguemovie.Adapter.CardViewTVShowAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TVShowFragment extends Fragment {
    private RecyclerView rvTvShow;
    private ArrayList<TVShow> list = new ArrayList<>();


    public TVShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tvshow,container,false);
        rvTvShow = view.findViewById(R.id.rv_tvShow);
        rvTvShow.setHasFixedSize(true);

        list.addAll(TVShowData.getListData());
        showRecyclerTvShow();

        return view;
    }

    private void showRecyclerTvShow(){
        rvTvShow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewTVShowAdapter cardViewTvShowAdapter = new CardViewTVShowAdapter(this.getContext());
        cardViewTvShowAdapter.setListTvShow(list);
        rvTvShow.setAdapter(cardViewTvShowAdapter);
    }
}
