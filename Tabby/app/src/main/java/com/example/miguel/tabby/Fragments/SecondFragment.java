package com.example.miguel.tabby.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.miguel.tabby.Adapters.PeopleAdapter;
import com.example.miguel.tabby.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private View view;
    public static PeopleAdapter peopleAdapter;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);

        ListView listPeople;

        listPeople = view.findViewById(R.id.lstPersons);
        peopleAdapter = new PeopleAdapter(getActivity(), FirstFragment.people, R.layout.list_item);
        listPeople.setAdapter(peopleAdapter);

        return view;
    }

}
