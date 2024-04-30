package com.example.pr9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.am, R.string.armenia, R.string.armeniaAM));
        list.add(new DataFlags(R.drawable.bg, R.string.bulgaria, R.string.bulgariaBG));
        list.add(new DataFlags(R.drawable.co, R.string.coloumbia, R.string.coloumbiaCO));
        list.add(new DataFlags(R.drawable.kr, R.string.koreasouth, R.string.koreasouthKS));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);

    }

}
