package cn.com.trans_cosmos.www.repaireapp.acitivty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import cn.com.trans_cosmos.www.repaireapp.Base.BaseActivity;
import cn.com.trans_cosmos.www.repaireapp.MainActivity;
import cn.com.trans_cosmos.www.repaireapp.R;

/**
 * Created by wangxin on 2017/8/22.
 */

public class LoginActivity extends Activity  {

    public Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        findView();
//        initView();
    }

//    private void findView() {
//        btn_login = (Button) findViewById(R.id.login_login);
//    }
//
//    private void initView() {
//        btn_login.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.login_login:
//                startActivity(new Intent(this,MainActivity.class));
//                break;
//        }
//    }
}
