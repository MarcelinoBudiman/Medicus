package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

public class BookingHistory extends AppCompatActivity {

    RecyclerView recycler;
    Button bookNow;
    Vector<Form> bookingData = new Vector<Form>();
    Form book1, book2;
    Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);
        recycler = findViewById(R.id.bookHistoryRecycler);
        bookNow = findViewById(R.id.buttonBook);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,1,28);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-mm-yyy");
        String dateFinal = formatDate.format(calendar.getTime());

        book1 = new Form("Dr. Hamdani", "RS Sari Asih", dateFinal);
        bookingData.add(book1);



        HistoryAdapter adapter = new HistoryAdapter(this, bookingData);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));



        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookingHistory.this,BookNow.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        count++;
        Integer size = bookingData.size();

        book2 = (Form) getIntent().getSerializableExtra("BookData");
        if (book2 != null){
            bookingData.add(book2);
        }

        HistoryAdapter adapter = new HistoryAdapter(this, bookingData);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

}