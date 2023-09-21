package com.example.sdanyimba;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HymRecAdapter extends RecyclerView.Adapter<HymRecAdapter.ViewHolder> {
    private ArrayList<Hym> hyms = new ArrayList<>();
    private final Context context;

    public HymRecAdapter(Context context) {
        this.context = context;
    }

    public void setHyms(ArrayList<Hym> hyms) {
        this.hyms = hyms;
        notifyDataSetChanged();
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.summary_hym, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {


        holder.txt1.setText(hyms.get(position).getHymNumber());
        holder.txt2.setText(hyms.get(position).getHymName());
        holder.txt3.setText(hyms.get(position).getHymDesc());
        holder.myLayouts.setOnClickListener(view -> {
            String name = hyms.get(position).getHymName();
            String number = hyms.get(position).getHymNumber();
            String longDesc = hyms.get(position).getHymDesc();


            Intent intent = new Intent(view.getContext(), SelectedHym.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK)
                    .putExtra("number", number)
                    .putExtra("title", name)
                    .putExtra("longDesc", longDesc);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return hyms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txt1;
        private final TextView txt2;
        private final TextView txt3;
        private final MaterialCardView myLayouts;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
            txt3 = itemView.findViewById(R.id.txt3);
            myLayouts = itemView.findViewById(R.id.myLayout);
        }
    }
}
