package com.trisha.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DeatailsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatails);

        textView=(TextView)findViewById(R.id.textView);

        String getName=getIntent().getExtras().getString("country");
        textView.setText(getName);
    }
}
