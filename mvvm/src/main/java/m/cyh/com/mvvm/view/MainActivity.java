package m.cyh.com.mvvm.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import m.cyh.com.mvvm.R;
import m.cyh.com.mvvm.databinding.ActivityMainBinding;
import m.cyh.com.mvvm.viewmodel.MainViewModel;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        MainViewModel mainViewModel = new MainViewModel(this);
        binding.setViewModel(mainViewModel);
    }
}
