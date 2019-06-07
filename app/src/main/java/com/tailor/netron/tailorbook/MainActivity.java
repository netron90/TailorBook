package com.tailor.netron.tailorbook;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.tailor.netron.tailorbook.Constants.Constants;
import com.tailor.netron.tailorbook.Fragments.HomeDefaultFragment;

public class MainActivity extends AppCompatActivity implements HomeDefaultFragment.OnFragmentInteractionListener {


    private FloatingActionButton fab;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.add_mesurement);
        fragmentManager = getSupportFragmentManager();
        HomeDefaultFragment homeDefaultFragment = new HomeDefaultFragment();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, homeDefaultFragment).commit();


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open activity mesurement
                Intent intent = new Intent(MainActivity.this, MesurementActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onFragmentInteraction(int i) {

    }
}
