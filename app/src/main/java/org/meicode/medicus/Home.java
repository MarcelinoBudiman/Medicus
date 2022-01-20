package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // buat receive user dari login
        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("User");
    }
}