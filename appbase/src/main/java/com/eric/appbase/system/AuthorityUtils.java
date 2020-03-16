package com.eric.appbase.system;

import android.Manifest;
import android.content.Context;
import android.util.Log;

import com.tbruyelle.rxpermissions.RxPermissions;

import rx.functions.Action1;

public class AuthorityUtils {


    public static void getAuth(int[] auths ,Context mContext){
//
//        for(int i:auths){
//
//        }

        RxPermissions.getInstance(mContext)
                .request(Manifest.permission.READ_CALENDAR)//这里填写所需要的权限
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {
                        if (aBoolean) {//true表示获取权限成功（注意这里在android6.0以下默认为true）
                            Log.i("permissions", Manifest.permission.READ_CALENDAR + "：" + "获取成功");
                        } else {
                            Log.i("permissions", Manifest.permission.READ_CALENDAR + "：" + "获取失败");
                        }
                    }
                });

    }


}
