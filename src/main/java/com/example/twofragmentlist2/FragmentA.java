package com.example.twofragmentlist2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        listView = view.findViewById(R.id.listViewId);
        arrayList = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, arrayList);
        listView.setAdapter(arrayAdapter);
        arrayList.add("Cristina");
        arrayList.add("Marian");
        arrayList.add("Michael");
        arrayList.add("Anna");
        arrayList.add("Sophie");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = arrayList.get(position);
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.fragmentAToFragmentB(item);
            }
        });
        return view;
    }

}
