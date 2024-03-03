package com.example.second;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder>{
    ArrayList<DataModel> dataset;

    public CustomeAdapter(ArrayList<DataModel> dataset) {
        this.dataset = dataset;
    }
    public static class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView textname;
        TextView textversion;
        ImageView imageView;

        public MyViewHolder (View itemview){
            super(itemview);
            textname = itemview.findViewById(R.id.textView13);
            textversion = itemView.findViewById(R.id.textView14);
            imageView = itemView.findViewById(R.id.imageView4);
        }

    }




    @NonNull
    @Override
    public CustomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        MyViewHolder myVHolder = new MyViewHolder (view);
        return myVHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeAdapter.MyViewHolder holder, int position) {
        holder.textname.setText(dataset.get(position).getName());
        holder.textversion.setText(dataset.get(position).getVersion());
        holder.imageView.setImageResource(dataset.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
