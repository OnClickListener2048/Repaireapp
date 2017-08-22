package cn.com.trans_cosmos.www.repaireapp.Base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by wangxin on 2017/8/22.
 */

public class BaseActivity extends Activity {

    public void startActivity(Class clazz) {
        startActivity(new Intent(this,clazz));
    }


}
