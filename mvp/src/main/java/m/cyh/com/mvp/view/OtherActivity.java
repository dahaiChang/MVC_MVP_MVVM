package m.cyh.com.mvp.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import m.cyh.com.mvp.R;

public class OtherActivity extends Activity implements OtherBaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //业务逻辑相关        请求图片或下载上传。。。
        //UI相关的业务逻辑    显示图片  显示进度条  弹TOAST

    }

    @Override
    public void showProgress(int progress) {

    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定
    }
}
