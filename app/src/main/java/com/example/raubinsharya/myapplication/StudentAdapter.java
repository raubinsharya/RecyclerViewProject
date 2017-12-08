package com.example.raubinsharya.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shashank.sony.fancytoastlib.FancyToast;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Raubinsh Arya on 08-12-2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{
    private Context context;
    private ArrayList<Student> students;
    private String url;
    public StudentAdapter(Context context, ArrayList<Student> students) {
        this.context=context;
        this.students=students;
    }
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.studentmodel,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
          holder.name.setText(students.get(position).getName());
          holder.trade.setText(students.get(position).getTrade());
          holder.rollNo.setText(students.get(position).getRollNo());
          holder.collageName.setText(students.get(position).getCollge());
          Picasso.with(context).load(url=students.get(position).getImageURL()).into(holder.imageView);
          holder.setItemClickListener(new ItemClickListener() {
              @Override
              public void onItemClick(int position) {
                 Intent intent=new Intent(context,SecondActivity.class);
                 intent.putExtra("URL",students.get(position).getImageURL());
                 context.startActivity(intent);
              }
          });




    }

    @Override
    public int getItemCount() {
        return students.size();
    }



    public class StudentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imageView;
        public TextView name;
        public TextView trade;
        public TextView rollNo;
        public TextView collageName;
        public LinearLayout linearLayout;
        private ItemClickListener itemClickListener;

        public StudentViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.name);
            trade=itemView.findViewById(R.id.trade);
            rollNo=itemView.findViewById(R.id.rollNo);
            collageName =itemView.findViewById(R.id.collegeName);
            linearLayout=itemView.findViewById(R.id.top);
            itemView.setOnClickListener(this);
        }
        public void setItemClickListener(ItemClickListener itemClickListener){
             this.itemClickListener=itemClickListener;
        }

        @Override
        public void onClick(View view) {
            FancyToast.makeText(context,"You Clicked",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,false).show();
            itemClickListener.onItemClick(this.getAdapterPosition());

        }
    }

}
