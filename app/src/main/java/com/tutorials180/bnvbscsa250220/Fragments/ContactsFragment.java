package com.tutorials180.bnvbscsa250220.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tutorials180.bnvbscsa250220.Adapters.OurAdapter;
import com.tutorials180.bnvbscsa250220.ModelClasses.SocialMediaPostModel;
import com.tutorials180.bnvbscsa250220.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    private View objectView;
    private RecyclerView objectRV;

    private ArrayList<SocialMediaPostModel> objectArrayList;
    private OurAdapter objectOurAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        objectView=inflater.inflate(R.layout.fragment_contacts, container, false);
        initializeObjectsOfFragment();

        return objectView;
    }


    private void initializeObjectsOfFragment()
    {
        try
        {
            objectRV=objectView.findViewById(R.id.contact_RV);
            objectArrayList=new ArrayList<>();

            addObjectsToArrayList();
        }
        catch (Exception e)
        {
            Toast.makeText(getContext(), "initializeObjectsOfFragment:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void addObjectsToArrayList()
    {
        try
        {
           objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));
            objectArrayList.add(new SocialMediaPostModel("User One",R.drawable.pic_one));

            objectOurAdapter=new OurAdapter(objectArrayList,getContext());
            objectRV.setLayoutManager(new LinearLayoutManager(getContext()));

            objectRV.setAdapter(objectOurAdapter);

        }
        catch (Exception e)
        {
            Toast.makeText(getContext(), "addObjectsToArrayList:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
