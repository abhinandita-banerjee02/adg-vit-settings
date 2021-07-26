package com.example.abhi_adg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter3 extends RecyclerView.Adapter<Adapter3.ViewHolder> {
    Context context;
    String title3[];
    int pic3[];
    int arr3[];

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView t3;
        ImageView img3;
        ImageView ar3;

        public ViewHolder( View itemView) {
            super(itemView);
            t3=itemView.findViewById(R.id.textView3);
            img3=itemView.findViewById(R.id.imageView4);
            ar3=itemView.findViewById(R.id.imageView5);

        }
    }

    public Adapter3(Context context,String[] title3,int pic3[],int arr3[]){
        this.context=context;
        this.title3=title3;
        this.pic3=pic3;
        this.arr3=arr3;
    }
    @Override
    public Adapter3.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.items_activity3,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( Adapter3.ViewHolder holder, int position) {

        holder.img3.setImageResource(pic3[position]);
        holder.t3.setText(title3[position]);
        holder.ar3.setImageResource(pic3[position]);

    }

    @Override
    public int getItemCount() {
        return title3.length;
    }
}
