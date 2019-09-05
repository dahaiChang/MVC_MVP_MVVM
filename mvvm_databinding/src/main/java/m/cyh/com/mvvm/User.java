package m.cyh.com.mvvm;

import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

public class User {
    public ObservableField<String> userName = new ObservableField<>();
    //点击TextView时弹出Log
    public void userOnClick(View view){
        Log.e("********User*******",userName.get());
    }
}
