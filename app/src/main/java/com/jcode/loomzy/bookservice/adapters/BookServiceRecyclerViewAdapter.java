package com.jcode.loomzy.bookservice.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcode.loomzy.R;
import com.jcode.loomzy.bookservice.models.ServiceItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BookServiceRecyclerViewAdapter extends RecyclerView.Adapter<BookServiceRecyclerViewAdapter.ItemsViewHolder> {

    private List<ServiceItem> serviceItemList;

    public BookServiceRecyclerViewAdapter(List<ServiceItem> serviceItemList) {
        this.serviceItemList = serviceItemList;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bookservice, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        ServiceItem serviceItem = serviceItemList.get(position);
        Picasso.get().load(serviceItem.getServiceImageUrl().trim())
                .into(holder.ivItemBookService);
        holder.tvItemBookService.setText(serviceItem.getServiceName());
    }

    @Override
    public int getItemCount() {
        return serviceItemList.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivItemBookService;
        private TextView tvItemBookService;
        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            ivItemBookService = itemView.findViewById(R.id.ivItemBookService);
            tvItemBookService = itemView.findViewById(R.id.tvItemBookService);
        }
    }
}
