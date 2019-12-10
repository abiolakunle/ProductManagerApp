package com.abiolasoft.productmanagerapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abiolasoft.productmanagerapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button categoriesBtn, propertyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        categoriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        propertyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent propIntent = new Intent(HomeActivity.this, PropertyActivity.class);
                startActivity(propIntent);
            }
        });
    }

    private void initializeViews() {
        categoriesBtn = findViewById(R.id.home_category_btn);
        propertyBtn = findViewById(R.id.home_prop_btn);
    }

}
