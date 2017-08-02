package com.map.google.bundledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    AppCompatEditText e1,e2,e3;
    AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    public void initView()
    {
        e1=(AppCompatEditText)findViewById(R.id.textView1);
        e2=(AppCompatEditText)findViewById(R.id.textView2);
        e3=(AppCompatEditText)findViewById(R.id.textView3);
        b1=(AppCompatButton)findViewById(R.id.buttonid);
        setListener();
    }
    public void setListener()
    {
        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonid:
                saveData();
        }
    }
    public void saveData()
    {
        Bundle bundle=new Bundle();
        bundle.putString("name","vinod");
        bundle.putString("middlename","basavaraj");
        bundle.putString("lastname","hosamani");

        Intent intent=new Intent(this,Second.class);
        intent.putExtras(bundle);
        startActivity(intent);
        Toast.makeText(this, "hi how are you", Toast.LENGTH_SHORT).show();

        finish();
    }
}
