package org.meicode.medicus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.GridView;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class Home extends AppCompatActivity {

    User user;

    int array[] = {R.drawable.logo, R.drawable.logo,R.drawable.logo};
    String array2[] = {"Book Now","Book History","Profile"};

    GridView gridView;
    private BannerView bannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        HwAds.init(this);

        bannerView = findViewById(R.id.adView);
        bannerView.setAdId("testw6vs28auh3");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        bannerView.setBannerRefresh(60);
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

        gridView = findViewById(R.id.gridview);


        user = (User) getIntent().getSerializableExtra("User");

        GridAdaptor gridAdaptor = new GridAdaptor(this, array2, array);
        gridView.setAdapter(gridAdaptor);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Home.this,BookNow.class);
                    intent.putExtra("User", user);
                    startActivity(intent);
                }
                if (position == 1) {
                    //masuk ke BookHistory
                    Intent intent = new Intent(Home.this,BookingHistory.class);
                    intent.putExtra("User", user);
                    startActivity(intent);
                }
                if (position == 2) {
                    //masuk ke Profile
                    Intent intent = new Intent(Home.this,Profile.class);
                    intent.putExtra("User", user);
                    startActivity(intent);
                }
            }
        });
    }
}