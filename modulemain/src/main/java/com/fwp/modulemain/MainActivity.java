package com.fwp.modulemain;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Administrator on 2018/7/12.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnModuleOne,btnModuleTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnModuleOne = findViewById(R.id.btn_module_one);
        btnModuleTwo = findViewById(R.id.btn_module_two);
        btnModuleOne.setOnClickListener(this);
        btnModuleTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.btn_module_one){
            // 不带参数的跳转
            ARouter.getInstance().build("/module_one/mo_activity").navigation();
        }else if (viewId == R.id.btn_module_two){
             // 带参数的跳转
            ARouter.getInstance().build("/module_two/mt_activity").withString("key","我是传过来的参数").navigation();
        }
    }
}
