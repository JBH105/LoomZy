package com.jcode.loomzy.bookservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcode.loomzy.R;
import com.jcode.loomzy.bookservice.adapters.BookServiceRecyclerViewAdapter;
import com.jcode.loomzy.bookservice.models.ServiceItem;

import java.util.ArrayList;
import java.util.List;

public class BookServiceActivity extends AppCompatActivity {
RecyclerView recyclerViewBookService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_service);

        recyclerViewBookService=findViewById(R.id.recyclerViewBookService);

        List<ServiceItem> serviceItemList = new ArrayList<>();
        serviceItemList.add(new ServiceItem("www.google.com", "asdas"));
        serviceItemList.add(new ServiceItem("www.google.com", "fdsdfsg"));
        serviceItemList.add(new ServiceItem("www.google.com", "afcs"));
        serviceItemList.add(new ServiceItem("www.google.com", "afda"));
        serviceItemList.add(new ServiceItem("www.google.com", "dfgdfbv"));
        serviceItemList.add(new ServiceItem("www.google.com", "asdaertgredfvdfgvdfs"));
        serviceItemList.add(new ServiceItem("www.google.com", "asdsfggvdas"));
        serviceItemList.add(new ServiceItem("www.google.com", "athdyhgdfcxsdas"));
        serviceItemList.add(new ServiceItem("www.google.com", "asdafghl;bckmfldmhlbjofdiljhbjhs"));

        BookServiceRecyclerViewAdapter bookServiceRecyclerViewAdapter = new BookServiceRecyclerViewAdapter(serviceItemList);
        recyclerViewBookService.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerViewBookService.setAdapter(bookServiceRecyclerViewAdapter);
    }
}