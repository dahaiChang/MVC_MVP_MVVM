package m.cyh.com.mvvm.viewmodel;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

/**
*负责M到V层，V到M层
*@author dahaiChang
*created at 2019/9/5 20:45
*/
public class MainViewModel {
    private String userName;
    private String psd;
    private Context mContext;

    public MainViewModel(Context context){
        this.mContext = context;
    }
    //从EditText拿到userName
    public TextWatcher userNameChangeListener(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                userName = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }

    //从EditText拿到psd
    public TextWatcher psdChangeListener(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                psd = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }

    //登陆点击实现
    public void login(View view){
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(psd)){
            if (userName.equals("dahai") && psd.equals("123456")){

                Toast.makeText(mContext,"登陆成功！",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(mContext,"账号或密码错误！",Toast.LENGTH_LONG).show();
            }
        }else {
            Toast.makeText(mContext,"账号或密码输入不能为空！",Toast.LENGTH_LONG).show();
        }
    }
}
