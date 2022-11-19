package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    private ArrayList<String> countryNameList;
    private ArrayList<String> detailList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detailList = detailList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.textViewDetail.setText(detailList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Toast.makeText(context, "You selected Japan Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(context, "You selected Canada Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(context, "You selected Singapore Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(context, "You selected Spain Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(context, "You selected South Korea Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 5) {
                    Toast.makeText(context, "You selected Sweden Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    Toast.makeText(context, "You selected New Zealand Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 7) {
                    Toast.makeText(context, "You selected Hawaii Flag", Toast.LENGTH_SHORT).show();
                } else if (position == 8) {
                    Toast.makeText(context, "You selected France Flag", Toast.LENGTH_SHORT).show();
                } else if ( position == 9) {
                    Toast.makeText(context, "You selected Italy Flag", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryNameList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewCountryName;
        private TextView textViewDetail;

        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
           textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
              textViewDetail = itemView.findViewById(R.id.textViewDetail);
                imageView = itemView.findViewById(R.id.imageView);
                cardView = itemView.findViewById(R.id.cardView);
        }
    }
}