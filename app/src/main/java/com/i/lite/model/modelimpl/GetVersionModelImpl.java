package com.i.lite.model.modelimpl;

import android.util.Log;
import android.view.LayoutInflater;

import com.i.lite.app.App;
import com.i.lite.entity.GetListParam;
import com.i.lite.entity.TestBean;
import com.i.lite.inter.OnGetVersionListener;
import com.i.lite.model.modelinter.GetVersionModel;
import com.i.lite.utils.NetworkUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by L on 2018/1/12.
 */

public class GetVersionModelImpl implements GetVersionModel {


    @Override
    public void getVersionInfo(GetListParam param,final OnGetVersionListener getListInfoListener) {

        if (!NetworkUtil.isNetworkAvailable(App.getContext())) {
//            Toast.makeText(App.getContext(), "没有网络O", Toast.LENGTH_SHORT).show();
            getListInfoListener.onGetVersionError( "没有网络o" );
            return;
        }

        LayoutInflater.from(App.getContext());

        App.getAPI().getVersionInfo("getVersion")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TestBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull TestBean bean) {
                        try {
                            getListInfoListener.onGetVersionSuccess(bean);
                        }catch (Exception e){
                            getListInfoListener.onGetVersionError(e.toString());
                        }

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        getListInfoListener.onGetVersionError(e.toString());
                        Log.i("ccccccc","onError="+e.toString());
                        Log.i("ccccccc","onError="+e.toString());
                    }

                    @Override
                    public void onComplete() {
                    }
                });










    }

}
