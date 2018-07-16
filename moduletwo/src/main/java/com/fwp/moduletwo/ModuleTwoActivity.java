package com.fwp.moduletwo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Administrator on 2018/7/12.
 */
// 这里用阿里的路由标记此activity
@Route(path = "/module_two/mt_activity")
public class ModuleTwoActivity extends Activity {

    // 获取传过来的数据
    @Autowired(name = "key")
    String key;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_two);

        ARouter.getInstance().inject(this);

        TextView text = findViewById(R.id.text);
        text.setText(key);
    }
}
