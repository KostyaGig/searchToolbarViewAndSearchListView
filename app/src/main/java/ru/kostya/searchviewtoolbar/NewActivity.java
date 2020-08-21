package ru.kostya.searchviewtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView mDetailTv = findViewById(R.id.textView);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String toolbarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        getSupportActionBar().setTitle(toolbarTitle);
        //set text in textview
        mDetailTv.setText(mContent);
    }

}