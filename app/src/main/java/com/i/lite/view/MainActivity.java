package com.i.lite.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.i.lite.R;
import com.i.lite.databinding.ActivityMainBinding;
import com.i.lite.presenter.MainGetVersionPresenter;


public class MainActivity extends BaseActivity<ActivityMainBinding>  implements MainGetVersionInter{


    MainGetVersionPresenter getVersionPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("订单详情");
        getVersionPresenter = new MainGetVersionPresenter(this);
    }


    public void getNews(View view) {
        getVersionPresenter.getVersionInfo();
    }

    @Override
    public void setVersion(String version) {
        bindingView.tv.setText(version);
    }

}
