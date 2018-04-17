package com.i.lite.presenter;

import com.i.lite.entity.TestBean;
import com.i.lite.inter.OnGetVersionListener;
import com.i.lite.model.modelimpl.GetVersionModelImpl;
import com.i.lite.view.MainGetVersionInter;


public class MainGetVersionPresenter implements OnGetVersionListener {

    GetVersionModelImpl model = new GetVersionModelImpl();
    MainGetVersionInter inter;


    public MainGetVersionPresenter(MainGetVersionInter inter) {
        this.inter = inter;
    }


    public void getVersionInfo(){

        if(model == null){
            model = new GetVersionModelImpl();
        }
        model.getVersionInfo(null,this);
    }


    @Override
    public void onGetVersionSuccess(TestBean bean) {
        inter.setVersion(bean.body.version_num);
    }

    @Override
    public void onGetVersionError(String errStr) {
        inter.setVersion(errStr);
    }
}
