package com.example.savemyspot;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DateAdapter extends RecyclerView.Adapter<DateAdapter.DateViewHolder> {

    private List<DateModel> dateList;
    private Context context;

    public DateAdapter(Context context, List<DateModel> dateList) {
        this.context = context;
        this.dateList = dateList;
    }

    @NonNull
    @Override
    public DateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.date_item, parent, false);
        return new DateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DateViewHolder holder, int position) {
        DateModel dateModel = dateList.get(position);

        holder.dateText.setText(dateModel.getDate());

        if (dateModel.isSelected()) {
            holder.dateText.setBackgroundColor(context.getResources().getColor(R.color.teal_button)); // Highlight active date in teal
            holder.dateText.setTextColor(Color.WHITE); // Text color for active date
        } else {
            holder.dateText.setBackgroundColor(Color.TRANSPARENT); // Transparent for inactive dates
            holder.dateText.setTextColor(Color.BLACK); // Normal text color for inactive dates
        }

        holder.itemView.setOnClickListener(v -> {
            // Unselect all dates and select the clicked one
            for (DateModel date : dateList) {
                date.setSelected(false);
            }
            dateModel.setSelected(true);
            notifyDataSetChanged(); // Refresh the RecyclerView
        });
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public static class DateViewHolder extends RecyclerView.ViewHolder {
        TextView dateText;

        public DateViewHolder(View itemView) {
            super(itemView);
            dateText = itemView.findViewById(R.id.dateText); // Date TextView
        }
    }
}
