package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BookingHistory extends AppCompatActivity {

    RecyclerView recycler;
    String doctorName[];
    String hospital[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);

        recycler = findViewById(R.id.bookHistoryRecycler);
        Intent i;

        HistoryAdapter adapter = new HistoryAdapter(this, doctorName, hospital);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}