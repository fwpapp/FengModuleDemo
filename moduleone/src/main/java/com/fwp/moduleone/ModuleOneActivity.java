package com.fwp.moduleone;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by Administrator on 2018/7/12.
 */
// 这里用阿里的路由标记此activity
@Route(path = "/module_one/mo_activity")
public class ModuleOneActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_one);
    }
}
