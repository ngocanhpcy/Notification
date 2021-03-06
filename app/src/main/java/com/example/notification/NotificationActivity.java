package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class NotificationActivity extends AppCompatActivity {

    ImageButton btnTransfer,btnDropDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        linkViews();
        addEvents();

       // getSupportFragmentManager().beginTransaction().add(R.id.layout_notification, new SaleFragment()).commit();
    }



    private void linkViews() {

        btnTransfer = findViewById(R.id.btnTransfer);
        btnDropDown = findViewById(R.id.btnDropDown);
    }

    private void addEvents() {
        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadNewSale = new Intent(NotificationActivity.this,ItemSale.class);
                startActivity(loadNewSale);
            }

        });
    }
}