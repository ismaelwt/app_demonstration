package com.example.ismael.appteste.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ismael.appteste.R;
import com.example.ismael.appteste.model.News;

import java.util.List;

public class AdapterList extends ArrayAdapter<News> {

    private Context context;
    private List<News> values;


    public AdapterList(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        this.context = context;
        this.values = objects;
    }
    public int getCount() {
        return values.size();
    }

    public News getItem(int position) {
        return values.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = LayoutInflater.from(context).inflate(
                R.layout.item, parent, false);
        TextView title = (TextView) rootView.findViewById(R.id.title);
        title.setTypeface(Typeface.DEFAULT_BOLD);

        ImageView image = (ImageView) rootView.findViewById(R.id.image);
        TextView description = (TextView) rootView.findViewById(R.id.descrption);
        TextView leiamais = (TextView) rootView.findViewById(R.id.leiamais);
        leiamais.setPaintFlags(leiamais.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        title.setText(values.get(position).getTitulo());
        description.setText(values.get(position).getDescricao());
        return rootView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View rootView = LayoutInflater.from(context).inflate(
                R.layout.item, parent, false);
        TextView tv = (TextView) rootView.findViewById(R.id.title);
        tv.setText(values.get(position).getTitulo());
        return rootView;
    }
}
