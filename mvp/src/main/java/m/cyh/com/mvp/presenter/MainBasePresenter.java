package m.cyh.com.mvp.presenter;

import m.cyh.com.mvp.model.User;
import m.cyh.com.mvp.view.BaseView;
import m.cyh.com.mvp.view.MainBaseView;

/**
* 只为MainActivity提供业务逻辑抽象接口Presenter
*@author dahaiChang
*created at 2019/9/4 8:51
*/
public interface MainBasePresenter extends BasePresenter<MainBaseView>{
    void login(User user);
}
