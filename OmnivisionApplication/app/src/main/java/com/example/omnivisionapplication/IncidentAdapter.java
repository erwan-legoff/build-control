package com.example.omnivisionapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.omnivisionapplication.R;

import java.util.List;

public class IncidentAdapter extends BaseAdapter {


    private List<Incident> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public IncidentAdapter(Context context, List<Incident> listData) {
        this.listData = listData;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.incident_template, null);
            holder = new ViewHolder();
            holder.imageIncident = (ImageView) convertView.findViewById(R.id.imgincident);
            holder.nomIncident = (TextView) convertView.findViewById(R.id.nom_incident);
            holder.graviteIncident = (TextView) convertView.findViewById(R.id.gravite_incident);
            holder.descriptionIncident = (TextView) convertView.findViewById(R.id.description_incident);
            holder.dateIncident = (TextView) convertView.findViewById(R.id.date_incident);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Incident incident = this.listData.get(position);
        holder.nomIncident.setText(incident.getNomIncident());
        holder.graviteIncident.setText(String.valueOf(incident.getGraviteIncident()));
        holder.descriptionIncident.setText(incident.getDescriptionIncident());
        holder.dateIncident.setText(incident.getDateCapture());

        int imageId = this.getMipmapResIdByName(incident.getNomCapture());

        holder.imageIncident.setImageResource(imageId);

        return convertView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView imageIncident;
        TextView nomIncident;
        TextView graviteIncident;
        TextView descriptionIncident;
        TextView dateIncident;
    }
}
