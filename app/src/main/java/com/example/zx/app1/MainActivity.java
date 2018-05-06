package com.example.zx.app1;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{
    EditText abc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button neibu = (Button) findViewById(R.id.button1);
        neibu.setOnClickListener(new NEIBU());
        Button waibu = (Button) findViewById(R.id.button2);
        waibu.setOnClickListener(new out(this));
        Button niming = (Button) findViewById(R.id.button3);
        niming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText abc = (EditText) findViewById(R.id.abc);
                abc.setText("匿名内部类");
            }
        });
        Button bangding = (Button) findViewById(R.id.button5);
        bangding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText abc = (EditText) findViewById(R.id.abc);
                abc.setText("直接绑定到标签");
            }
        });
        Button ac = (Button) findViewById(R.id.button4);
        ac.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        EditText abc = (EditText) findViewById(R.id.abc);
        abc.setText("Activity");
    }
    public static class activity_biaoqian extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_label, container, false);
            return view;
        }
    }
    public static class activtity_button extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_btn, container, false);
            return view;
        }
    }
    class NEIBU implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            EditText abc = (EditText) findViewById(R.id.abc);
            abc.setText("内部类");
        }
    }




}

