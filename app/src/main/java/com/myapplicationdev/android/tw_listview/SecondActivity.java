package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> module;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        module = new ArrayList<Module>();
        if (year.equals("Year 1")){
            module.add(new Module("C105",true));
            module.add(new Module("C207",true));
            module.add(new Module("C208",false));

        }
        else if (year.equals("Year 2")){
            module.add(new Module("C208",false));
            module.add(new Module("C200",true));
            module.add(new Module("C346",false));
        }
        else if (year.equals("Year 3")){
            module.add(new Module("C309",false));
            module.add(new Module("C201",true));
            module.add(new Module("C345",true));
        }




        aa = new ModuleAdapter(this,R.layout.moduleyearcell,module);
        lv.setAdapter(aa);




    }



}
