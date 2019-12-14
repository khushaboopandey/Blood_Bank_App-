package com.example.bloodbank;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Listitem> listitems;
    private Context context;

    public Adapter(List<Listitem> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Listitem listitem=listitems.get(position);
        holder.TextViehead.setText(listitem.name);
        holder.TextViewdes.setText(listitem.Contact);


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent=new Intent(context,ViewContact.class);
               //11s startActivity(intent);
                Toast.makeText(context,"You Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView TextViehead;
        public TextView TextViewdes;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextViehead =(TextView) itemView.findViewById(R.id.textviewhead);
            TextViewdes=(TextView)itemView.findViewById(R.id.textviewDesc);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linearlayout);
        }
    }
}
