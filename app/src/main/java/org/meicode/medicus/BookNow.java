package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookNow extends AppCompatActivity {
//    private Context activity;
//    final View dialogView = View.inflate(activity, R.layout.activity_book_now, null);]
    private EditText nama_dokter,rumah_sakit;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        nama_dokter = findViewById(R.id.nama_dokter);
        rumah_sakit = findViewById(R.id.nama_rumah_sakit);
        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dokter = nama_dokter.getText().toString();
                String rumah = rumah_sakit.getText().toString();

                Intent intent = new Intent(BookNow.this, Home.class);
                intent.putExtra("keydokter",dokter);
                intent.putExtra("keyrumahsakit", rumah);
                startActivity(intent);
            }
        });
        //        DatePicker datePicker = (DatePicker) dialogView.findViewById(R.id.date_picker);

//        Calendar calendar = new GregorianCalendar(datePicker.getYear(),
//                datePicker.getMonth(),
//                datePicker.getDayOfMonth());

    }



}