package m.cyh.com.mvp.view;

/**
* UI逻辑抽象接口View
*@author dahaiChang
*created at 2019/9/4 9:55
*/
public interface MainBaseView extends BaseView{
    void loginSuccess(String msg);
    void loginFailed(String msg);
}
