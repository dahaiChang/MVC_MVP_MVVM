package m.cyh.com.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import m.cyh.com.mvp.R;
import m.cyh.com.mvp.model.User;
import m.cyh.com.mvp.presenter.MainBasePresenterImpl;

public class MainActivity extends Activity implements MainBaseView {

    private MainBasePresenterImpl mainBasePresenter;
    private EditText et_username;
    private EditText et_psd;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = findViewById(R.id.et_user);
        et_psd = findViewById(R.id.et_psd);
        btn_login = findViewById(R.id.bt_login);

        mainBasePresenter = new MainBasePresenterImpl();
        mainBasePresenter.attachView(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(et_username.getText().toString(),et_psd.getText().toString());
                mainBasePresenter.login(user);
            }
        });
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess(String msg) {
        showToast(msg);
    }

    @Override
    public void loginFailed(String msg) {
        showToast(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainBasePresenter.detachView();//解除绑定
    }
}
