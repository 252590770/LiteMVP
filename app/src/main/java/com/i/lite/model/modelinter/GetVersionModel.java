package com.i.lite.model.modelinter;

import com.i.lite.entity.GetListParam;
import com.i.lite.inter.OnGetVersionListener;

/**
 * Created by L on 2018/1/12.
 */

public interface GetVersionModel {

    void getVersionInfo(GetListParam param ,OnGetVersionListener getListInfoListener);

}
