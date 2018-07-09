package com.tutor.feel_better.swipetry;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterRCv extends RecyclerView.Adapter<AdapterRCv.MyViewHolder>{
    List<Integer> list;

    public AdapterRCv(Context ctx, List<Integer> mlist){
        this.list=mlist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myVider= LayoutInflater.from(parent.getContext()).inflate(R.layout.listlayout,parent,false);

        return new MyViewHolder(myVider);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mynumbrre;
        public MyViewHolder(View itemView) {
            super(itemView);
            mynumbrre=itemView.findViewById(R.id.mynumbrre);
        }

        public void Bind(Integer numb){
            mynumbrre.setText(String.valueOf(numb));
        }
    }
}
