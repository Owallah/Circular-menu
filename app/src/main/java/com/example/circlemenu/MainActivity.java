package com.example.circlemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu = findViewById(R.id.circle_menu);
        constraintLayout = findViewById(R.id.my_layout);

        circleMenu.setMainMenu(Color.parseColor("#940599"),R.drawable.ic_menu,R.drawable.ic_baseline_cancel_24)
                .addSubMenu(Color.parseColor("#ff8a5c"),R.drawable.ic_home)
                .addSubMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_baseline_search_24)
                .addSubMenu(Color.parseColor("#88bef5"),R.drawable.ic_notifications)
                .addSubMenu(Color.parseColor("#83e85a"),R.drawable.ic_gps)
                .addSubMenu(Color.parseColor("#FF4832"),R.drawable.ic_settings)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#ecfffb"));
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#96f7d2"));
                                break;
                            case 2:
                                Toast.makeText(MainActivity.this, "notifications", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fac4a2"));
                                break;
                            case 3:
                                Toast.makeText(MainActivity.this, "gps", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#d3cde6"));
                                break;
                            case 4:
                                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fff591"));
                                break;
                        }

                    }
                });

    }
}