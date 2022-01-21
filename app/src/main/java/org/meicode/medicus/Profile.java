package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profile extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);

        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getName();
            String email = user.getEmail();
        }


    }
}