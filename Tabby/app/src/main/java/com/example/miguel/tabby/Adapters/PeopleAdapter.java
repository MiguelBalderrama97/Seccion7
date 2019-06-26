package com.example.miguel.tabby.Adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miguel.tabby.Models.Person;
import com.example.miguel.tabby.R;

import java.util.List;

public class PeopleAdapter extends BaseAdapter {

    private Context context;
    private List<Person> people;
    private int layout;

    private Person currentPerson;

    private ImageView icon;

    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            icon.setImageBitmap(currentPerson.getCountry().getImage());
        }
    };

    private Thread thread = new Thread() {
        @Override
        public void run() {
            super.run();
            handler.post(runnable);
        }
    };

    public PeopleAdapter(Context context, List<Person> people, int layout) {
        this.context = context;
        this.people = people;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView name, countryName;

        if (convertView == null) {
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            convertView = layoutInflater.inflate(layout, parent, false);
        }

        icon = convertView.findViewById(R.id.imgCountryItem);
        name = convertView.findViewById(R.id.txtNameCountryItem);
        countryName = convertView.findViewById(R.id.txtCountryItem);

        currentPerson = people.get(position);

        name.setText(currentPerson.getName());
        countryName.setText(currentPerson.getCountry().getName());

        thread.start();

        return convertView;
    }
}
