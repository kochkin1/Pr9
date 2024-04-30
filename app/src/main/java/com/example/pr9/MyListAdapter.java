package com.example.pr9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    private LayoutInflater lInflater;
    private ArrayList<DataFlags> list;


    public MyListAdapter(Context context, ArrayList<DataFlags> data){
        list = data;
        lInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataFlags getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View v = convertView;

        if (v == null){
            holder = new ViewHolder();
            v = lInflater.inflate(R.layout.listview, parent, false);
            holder.flag = (ImageView) v.findViewById(R.id.flagImage);
            holder.name = (TextView) v.findViewById(R.id.name);
            holder.abbreviature = ((TextView) v.findViewById(R.id.abbreviature));
            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        DataFlags dataFlags = getData(position);

        holder.flag.setImageResource(dataFlags.getFlagID());
        holder.name.setText(v.getResources().getString(dataFlags.getNameID()));
        holder.abbreviature.setText(v.getResources().getString(dataFlags.getAbbreviatetionID()));

        return v;
    }
    DataFlags getData(int position) {
        return (getItem(position));
    }

    private static class ViewHolder{
        private ImageView flag;
        private TextView name;
        private TextView abbreviature;
    }
}
