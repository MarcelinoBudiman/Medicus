package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BookingHistory extends AppCompatActivity {

    RecyclerView recycler;
    Button bookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);
        recycler = findViewById(R.id.bookHistoryRecycler);

        bookNow = findViewById(R.id.buttonBook);

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookingHistory.this,BookNow.class);
                startActivity(intent);
            }
        });

        String name = getIntent().getStringExtra("keydokter");
        String h = getIntent().getStringExtra("keyrumahsakit");
        String date = getIntent().getStringExtra("keycalendar");

        HistoryAdapter adapter = new HistoryAdapter(this, name, h, date);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}