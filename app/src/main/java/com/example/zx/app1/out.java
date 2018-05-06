package com.example.zx.app1;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class out implements View.OnClickListener {
    private Activity act;
    public out(Activity act)

    {
        this.act = act;
    }
    @Override
    public void onClick(View source)
    {
        EditText abc = (EditText) act.findViewById(R.id.abc);
        abc.setText("外部类");
    }
}