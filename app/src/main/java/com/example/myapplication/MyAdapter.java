package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String[] titleData;
    String[] dateData;
    String[] bodyData;
    Context context;

    public MyAdapter(String[] titleData, String[] dateData, String[] bodyData, Context context) {
        this.dateData = dateData;
        this.titleData = titleData;
        this.bodyData = bodyData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.titletextView.setText(titleData[i]);
        myViewHolder.datetextView.setText(dateData[i]);
        myViewHolder.datatextView.setText(bodyData[i]);
        myViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("POSITION", i);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return titleData.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titletextView;
        TextView datetextView;
        TextView datatextView;
        LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titletextView = (TextView) itemView.findViewById(R.id.titletextid);
            datetextView = (TextView) itemView.findViewById(R.id.datetextid);
            datatextView = (TextView) itemView.findViewById(R.id.datatextid);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.list_item);
        }
    }
}
