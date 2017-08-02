package com.map.google.bundledemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

/**
 * Created by vinod on 1/8/17.
 */

public class Second extends AppCompatActivity implements View.OnClickListener
{
    AppCompatTextView e1,e2,e3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();

    }
    public void initView()
    {
        e1=(AppCompatTextView) findViewById(R.id.sec1);
        e2=(AppCompatTextView) findViewById(R.id.sec2);
        e3=(AppCompatTextView) findViewById(R.id.sec3);
        getValuesFromMain();

    }

    public void getValuesFromMain()
    {
        /*Bundle getBundle =null;
        getBundle=this.getIntent().getExtras();
        String n=getBundle.getString("name");
        String m=getBundle.getString("middlename");
        String l=getBundle.getString("lastname");

        e1.setText(n);
        e2.setText(m);
        e3.setText(l);*/

        Bundle bundle = getIntent().getExtras();
        e1.setText(""+bundle.getString("name"));
        e2.setText(""+bundle.getString("middlename"));
        e3.setText(""+bundle.getString("lastname"));
    }

    @Override
    public void onClick(View view)
    {

    }
}
