package com.example.abhi_adg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder> {

    Context context;
    String title[];
    int pic[];
    int arr1[];

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView t;
        ImageView img;
        ImageView ar1;

        public ViewHolder( View itemView) {
            super(itemView);
            t=itemView.findViewById(R.id.textView);
            img=itemView.findViewById(R.id.imageView);
            ar1=itemView.findViewById(R.id.imageView6);
        }
    }
    public Adapter1(Context context,String[] title,int[] pic,int[] arr1){
        this.context=context;
        this.title=title;
        this.pic=pic;
        this.arr1=arr1;
    }

    @Override
    public Adapter1.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.items_activity,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( Adapter1.ViewHolder holder, int position) {

        holder.img.setImageResource(pic[position]);
        holder.t.setText(title[position]);
        holder.ar1.setImageResource(arr1[position]);


    }

    @Override
    public int getItemCount() {

        return title.length;
    }
}
