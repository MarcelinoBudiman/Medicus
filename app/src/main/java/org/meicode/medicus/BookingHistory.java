package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class BookingHistory extends AppCompatActivity {

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);

        recycler = findViewById(R.id.bookHistoryRecycler);
        Intent i;

        String name = getIntent().getStringExtra("keydoctor");
        String h = getIntent().getStringExtra("keyrumahsakit");
        String date = getIntent().getStringExtra("keycalendar");

        HistoryAdapter adapter = new HistoryAdapter(this, name, h, date);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}