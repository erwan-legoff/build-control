package com.example.omnivisionapplication.placeholder;

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

public class ChantierAdapter extends BaseAdapter {
    private List<Chantier> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public ChantierAdapter(Context context, List<Chantier> listData) {
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
            convertView = layoutInflater.inflate(R.layout.chantier_template, null);
            holder = new ViewHolder();
            holder.imageChantier1 = (ImageView) convertView.findViewById(R.id.imageChantier);
            holder.nomChantier1 = (TextView) convertView.findViewById(R.id.nomChantier);
            holder.graviteChantier1 = (TextView) convertView.findViewById(R.id.graviteChantier);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Chantier chantier = this.listData.get(position);
        holder.nomChantier1.setText(chantier.getNom_chantier());
        holder.graviteChantier1.setText(chantier.getImgPathString());

        int imageId = this.getMipmapResIdByName(chantier.getImgPathString());

        holder.imageChantier1.setImageResource(imageId);

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
        ImageView imageChantier1;
        TextView nomChantier1;
        TextView graviteChantier1;
    }
}
