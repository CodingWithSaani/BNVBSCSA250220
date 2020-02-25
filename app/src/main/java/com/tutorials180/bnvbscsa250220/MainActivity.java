package com.tutorials180.bnvbscsa250220;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tutorials180.bnvbscsa250220.Fragments.ContactsFragment;
import com.tutorials180.bnvbscsa250220.Fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private HomeFragment objectHomeFragment;
    private ContactsFragment objectContactsFragment;

    private BottomNavigationView objectBNV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }

    private void initializeObjects()
    {
        try
        {
            objectHomeFragment=new HomeFragment();
            objectContactsFragment=new ContactsFragment();

            objectBNV=findViewById(R.id.BNV);
            changeFragment(objectHomeFragment);

            objectBNV.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                            if(item.getItemId()==R.id.item_home)
                            {
                                changeFragment(objectHomeFragment);
                                return true;
                            }
                            else if(item.getItemId()==R.id.item_contacts)
                            {
                                changeFragment(objectContactsFragment);
                                return true;
                            }
                            return false;
                        }
                    }
            );
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:" +
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void changeFragment(Fragment objectFragment)
    {
        try
        {
            FragmentTransaction objectTransaction=
                    getSupportFragmentManager().beginTransaction();

            objectTransaction.replace(R.id.container,objectFragment).commit();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "changeFragment"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
