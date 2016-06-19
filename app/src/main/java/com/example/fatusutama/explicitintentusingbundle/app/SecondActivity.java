package com.example.fatusutama.explicitintentusingbundle.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView nameTv;
    TextView passwordTv;
    String name;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameTv=(TextView)findViewById(R.id.nameTv);
        passwordTv=(TextView)findViewById(R.id.passwordTv);

        Intent intent=getIntent();

        //name=getIntent().getStringExtra("name");
       // password=getIntent().getStringExtra("password");
        Bundle bundle=intent.getExtras();
        String name =bundle.getString("name");
        String password=bundle.getString("password");


        nameTv.setText(name);
        passwordTv.setText(password);

    }
}
