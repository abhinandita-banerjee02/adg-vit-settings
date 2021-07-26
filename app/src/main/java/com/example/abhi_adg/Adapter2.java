package com.example.abhi_adg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {

    Context context;
    String title2[];
    int pic2[];
    int arr2[];

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView t2;
        ImageView img2;
        ImageView ar2;

        public ViewHolder( View itemView) {
            super(itemView);
            t2=itemView.findViewById(R.id.textView2);
            img2=itemView.findViewById(R.id.imageView2);
            ar2=itemView.findViewById(R.id.imageView3);
        }
    }
    public Adapter2(Context context,String[] title2,int[] pic2,int arr2[]){
        this.context=context;
        this.title2=title2;
        this.pic2=pic2;
        this.arr2=arr2;
    }
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.items_activity2,parent,false);
        Adapter2.ViewHolder viewHolder=new Adapter2.ViewHolder(view);
        return viewHolder;
    }

    public void onBindViewHolder( Adapter2.ViewHolder holder, int position) {

        holder.img2.setImageResource(pic2[position]);
        holder.t2.setText(title2[position]);
        holder.ar2.setImageResource(arr2[position]);

    }
    @Override
    public int getItemCount() {

        return title2.length;
    }
}
