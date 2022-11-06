package com.example.pertemuan3_view_aplikasimeme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapter extends
        RecyclerView.Adapter<HomeAdapter.HomeViewHolder>{
    int images[];
    String data1[], data2[], data3[];
    Context context;
    public HomeAdapter(Context ct, String s1[], String s2[],String s3[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }
    @Nullable
    @Override
    public HomeAdapter.HomeViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_home,
                parent, false);
        return new HomeViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);
    }
    @Override
    public int getItemCount() {
        return images.length;
    }
    public class HomeViewHolder extends RecyclerView.ViewHolder{
        TextView myText1, myText2, myText3;
        ImageView myImage;
        FrameLayout mainLayout;
        public HomeViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.titleText);
            myText2 = itemView.findViewById(R.id.descriptionText);
            myText3 = itemView.findViewById(R.id.categoryText);
            myImage = itemView.findViewById(R.id.myImages);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
