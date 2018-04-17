package com.i.lite.view;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.i.lite.R;
import com.i.lite.databinding.ActivityBaseBinding;
import com.i.lite.utils.CommonUtils;
import com.i.lite.utils.statusbar.StatusBarUtil;


public class WelcomeActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);


        startActivity( new Intent(this,MainActivity.class));
        finish();

    }





}
