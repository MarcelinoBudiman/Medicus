package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class Home extends AppCompatActivity {

    int array[] = {
            R.drawable.logo, R.drawable.logo
    };
    String array2[] = {
            "Food", "Drink", "Snacks", "Top Up"
    };

    Button basketButton;


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        GridAdaptor gridAdaptor = new GridAdaptor(array2, array, this);
        gridView.setAdapter(gridAdaptor);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //masuk ke BookNow
                }
                if (position == 1) {
                    //masuk ke BookHistory
                }
            }
        });
    }
}