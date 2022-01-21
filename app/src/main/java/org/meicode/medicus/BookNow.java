package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookNow extends AppCompatActivity {
    private Context activity;
    final View dialogView = View.inflate(activity, R.layout.activity_book_now, null);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
    }

    public void submit_btn(View view){
        EditText nama_pasien = findViewById(R.id.nama_pasien);
        EditText rumah_sakit = findViewById(R.id.rumah_sakit);
        EditText nomor_telphone = findViewById(R.id.nomor_telphone);
        DatePicker datePicker = (DatePicker) dialogView.findViewById(R.id.date_picker);

        Calendar calendar = new GregorianCalendar(datePicker.getYear(),
                datePicker.getMonth(),
                datePicker.getDayOfMonth());
    }

}