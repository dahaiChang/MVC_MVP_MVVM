package m.cyh.com.mvvm;

import android.databinding.DataBindingUtil;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import m.cyh.com.mvvm.databinding.ActivityMainBinding;
/**
* 通过Data Binding控制控件改变View
*@author dahaiChang
*created at 2019/9/5 20:17
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        //没有通过ID找到控件，只是对field进行操作就可以改变view的值
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        final User user = new User();
        user.userName.set("dahai");
        binding.setUser(user);

        //子线程中更新View
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                user.userName.set("helloword!");
            }
        }).start();
    }
}
