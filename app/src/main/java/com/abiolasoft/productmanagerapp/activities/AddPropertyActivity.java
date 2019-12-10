package com.abiolasoft.productmanagerapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.abiolasoft.productmanagerapp.R;
import com.abiolasoft.productmanagerapp.services.PropertySevice;
import com.abiolasoft.productmanagerapp.viewmodels.Property;
import com.abiolasoft.productmanagerapp.viewmodels.PropertyValue;

import androidx.appcompat.app.AppCompatActivity;

public class AddPropertyActivity extends AppCompatActivity {

    private TextView propNameEtv, propValueEtv;
    private Button addPropValueBtn, addPropBtn;

    private PropertySevice propertySevice;
    private Property newProperty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property);
        intitalizeViews();
        newProperty = new Property();
        propertySevice = new PropertySevice();

        addPropBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = propNameEtv.getText().toString();

                newProperty.setName(name);
                propertySevice.add(newProperty);

                Intent propListInent = new Intent(AddPropertyActivity.this, PropertyActivity.class);
                startActivity(propListInent);
                finish();
            }
        });

        addPropValueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueName = propValueEtv.getText().toString();

                PropertyValue newPropertyValue = new PropertyValue();

                newPropertyValue.setName(valueName);

                newProperty.addPropertyValue(newPropertyValue);
            }
        });


    }

    private void intitalizeViews() {
        propNameEtv = findViewById(R.id.add_prop_name_etv);
        propValueEtv = findViewById(R.id.add_prop_value_etv);
        addPropValueBtn = findViewById(R.id.add_prop_value_btn);
        addPropBtn = findViewById(R.id.add_prop_btn);
    }
}
