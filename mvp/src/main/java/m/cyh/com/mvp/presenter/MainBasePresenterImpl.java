package m.cyh.com.mvp.presenter;

import android.text.TextUtils;

import m.cyh.com.mvp.model.User;
import m.cyh.com.mvp.view.MainBaseView;
/**
* MainActivity业务逻辑实现
*@author dahaiChang
*created at 2019/9/4 10:51
*/
public class MainBasePresenterImpl implements MainBasePresenter {
    private MainBaseView baseView;
    @Override
    public void attachView(MainBaseView v) {
        this.baseView = v;
    }

    @Override
    public void detachView() {
        baseView = null;
    }
    @Override
    public void login(User user) {
        if (!TextUtils.isEmpty(user.getUser()) && !TextUtils.isEmpty(user.getPsd())){
            if (user.getUser().equals("dahai") && user.getPsd().equals("123456")){
                baseView.loginSuccess("登陆成功！");
            }else {
                baseView.loginFailed("账号或密码错误！");
            }
        }else {
            baseView.showToast("输入不能为空！");
        }
    }
}
