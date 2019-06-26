package com.example.miguel.tabby.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.miguel.tabby.Models.Country;
import com.example.miguel.tabby.Models.Person;
import com.example.miguel.tabby.R;
import com.example.miguel.tabby.Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements Spinner.OnItemSelectedListener{

    private View view;

    public static List<Person> people = new ArrayList<>();

    private String countryName, countryCode;
    private List<Country> countries = new ArrayList<>();

    private Country currentCountry;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);

        Utils.getAllCountries(countries);

        Spinner spinCountry;
        final EditText etxtName;
        FloatingActionButton fabAdd;

        etxtName = view.findViewById(R.id.etxtNomFrag1);
        fabAdd = view.findViewById(R.id.fabAddFrag1);
        spinCountry = view.findViewById(R.id.spinCountryFrag1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.countries_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinCountry.setAdapter(adapter);
        spinCountry.setOnItemSelectedListener(this);

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etxtName.getText().toString();

                if(name.isEmpty()){
                    Toast.makeText(getActivity(), "Empty fields", Toast.LENGTH_SHORT).show();
                }else{
                    people.add(new Person(name, currentCountry));
                    Toast.makeText(getActivity(), "Person added successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        currentCountry = countries.get(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
