package com.example.omnivisionapplication.placeholder;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.omnivisionapplication.ModelOmniVision;
import com.example.omnivisionapplication.R;

import java.util.List;

public class ChantierAdapter extends BaseAdapter {
    private final List<ModelOmniVision.Chantier> chantierList;
    private final LayoutInflater layoutInflater;
    private final Context context;

    public ChantierAdapter(Context context, List<ModelOmniVision.Chantier> chantierList) {
        this.chantierList = chantierList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return chantierList.size();
    }

    @Override
    public Object getItem(int position) {
        return chantierList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.chantier_template, null);
            holder = new ViewHolder();
            holder.imageIncident = (ImageView) convertView.findViewById(R.id.imageChantier);
            holder.nomChantier1 = (TextView) convertView.findViewById(R.id.nomChantier);
            holder.graviteIncident = (TextView) convertView.findViewById(R.id.graviteIncident);
            holder.nomIncident = (TextView) convertView.findViewById(R.id.nomIncident);
            holder.descriptionIncident = (TextView) convertView.findViewById(R.id.descriptionIncident);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ModelOmniVision.Chantier chantier = this.chantierList.get(position);
        Log.e(TAG, "getView: TAILLE LAST INCIDENT"+ chantier.getIncidents().size());
        if(chantier.getIncidents().size() > 0){
            ModelOmniVision.Chantier.Incident lastIncident = chantier.getIncidents().get(0);
            holder.nomChantier1.setText(chantier.getNom_chantier());
            holder.graviteIncident.setText(String.valueOf(lastIncident.getGravite_incident()));
            holder.descriptionIncident.setText(lastIncident.getDescription_incident());
            holder.nomIncident.setText(lastIncident.getNom_incident());
            int imageId = this.getMipmapResIdByName(lastIncident.getUrl_capture());
            holder.imageIncident.setImageResource(imageId);
        }



        return convertView;
    }

    /**
     * Utilisée pour récupérer l'id à partir du nom de l'image
     * @param resName
     * @return
     */
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.e("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView imageIncident;
        TextView nomChantier1;
        TextView descriptionIncident;
        TextView nomIncident;
        TextView graviteIncident;
    }
}
