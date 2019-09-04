package cyh.com.mvc_mvp_mvvm;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
* 简单登陆实例-MVC模式
*@author dahaiChang
*created at 2019/9/3 10:32
*/
public class MainActivity extends Activity {

    private EditText et_user;
    private EditText et_psd;
    private Button bt_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_user = findViewById(R.id.et_user);
        et_psd = findViewById(R.id.et_psd);
        bt_login = findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = et_user.getText().toString();
                String psd = et_psd.getText().toString();
                if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(psd)){
                    if (user.equals("dahai" )&& psd.equals("123456")){
                        Toast.makeText(MainActivity.this,"登陆成功！",Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(MainActivity.this,"登陆失败！",Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this,"输入不能为空！",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
