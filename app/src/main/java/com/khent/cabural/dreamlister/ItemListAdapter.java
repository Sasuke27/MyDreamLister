package com.khent.cabural.dreamlister;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by khent on 10/12/2017.
 */

public class ItemListAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<Items> itemList;

    public ItemListAdapter(Context context, int layout, ArrayList<Items> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName, txtPrice, txtDesc;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtName = row.findViewById(R.id.editTextName);
            holder.txtPrice = row.findViewById(R.id.editTextPrice);
            holder.txtDesc = row.findViewById(R.id.AddItemDesc);
            holder.imageView = row.findViewById(R.id.ImageViewList);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Items items = itemList.get(position);

        holder.txtName.setText(items.getListName());
        holder.txtPrice.setText(items.getListPrice());
        holder.txtDesc.setText(items.getListDesc());

        byte[] foodImage = items.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(foodImage, 0, foodImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
