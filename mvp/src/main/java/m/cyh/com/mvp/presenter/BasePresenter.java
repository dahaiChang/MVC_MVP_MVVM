package m.cyh.com.mvp.presenter;

import m.cyh.com.mvp.view.MainBaseView;
/**
* 业务逻辑抽取接口  要使用泛型
*@author dahaiChang
*created at 2019/9/4 10:52
*/
public interface BasePresenter<T> {
    void attachView(T v);
    void detachView();
}
