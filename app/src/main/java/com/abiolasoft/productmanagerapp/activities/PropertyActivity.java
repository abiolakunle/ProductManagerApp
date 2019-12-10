package com.abiolasoft.productmanagerapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abiolasoft.productmanagerapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class PropertyActivity extends AppCompatActivity {

    private Button addPropBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        initializeViews();

        addPropBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(PropertyActivity.this, AddPropertyActivity.class);
                startActivity(addIntent);
            }
        });
    }

    private void initializeViews() {
        addPropBtn = findViewById(R.id.prop_add_btn);
    }
}
