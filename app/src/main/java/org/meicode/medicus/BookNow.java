package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookNow extends AppCompatActivity {
//    private Context activity;
//    final View dialogView = View.inflate(activity, R.layout.activity_book_now, null);]
    private EditText nama_dokter,rumah_sakit;
    private DatePicker date;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        nama_dokter = findViewById(R.id.nama_dokter);
        rumah_sakit = findViewById(R.id.nama_rumah_sakit);
        date = findViewById(R.id.date_picker);
        btn = findViewById(R.id.buttonSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dokter = nama_dokter.getText().toString();
                String rumah = rumah_sakit.getText().toString();
                int day = date.getDayOfMonth();
                int month = date.getMonth();
                int year = date.getYear();
                Calendar calendar = Calendar.getInstance();
                calendar.set(year,month,day);
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy");
                String dateFinal = format.format(calendar);

                Intent intent = new Intent(BookNow.this, BookingHistory.class);
                intent.putExtra("keydokter",dokter);
                intent.putExtra("keyrumahsakit", rumah);
                intent.putExtra("keycalendar", dateFinal);
                startActivity(intent);
            }
        });

    }



}