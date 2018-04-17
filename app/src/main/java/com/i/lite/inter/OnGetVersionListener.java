package com.i.lite.inter;

import com.i.lite.entity.DrivigOrderResult;
import com.i.lite.entity.GetListResult;
import com.i.lite.entity.NewsEntity;
import com.i.lite.entity.TestBean;

import java.util.ArrayList;

/**
 * Created by L on 2018/1/12.
 */

public interface OnGetVersionListener {
    void onGetVersionSuccess(TestBean bean);
    void onGetVersionError(String errStr);
}
