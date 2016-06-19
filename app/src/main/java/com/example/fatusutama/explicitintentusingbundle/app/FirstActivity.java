package com.example.fatusutama.explicitintentusingbundle.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText namaEt;
    EditText passwordEt;
    String name;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        namaEt=(EditText)findViewById(R.id.namaEt);
        passwordEt=(EditText)findViewById(R.id.passwordEt);

    }

    public void submitInformation(View view) {
        name=namaEt.getText().toString();
        password=passwordEt.getText().toString();


        Intent intent=new Intent(FirstActivity.this,SecondActivity.class);

        //intent.putExtra("name",name);
        //intent.putExtra("password",password);

        Bundle bundle= new Bundle();
        bundle.putString("name",name);
        bundle.putString("password",password);

        intent.putExtras(bundle);

        startActivity(intent);


    }
}
