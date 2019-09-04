package m.cyh.com.mvp.presenter;

import m.cyh.com.mvp.view.OtherBaseView;
/**
* 只为OtherActivity提供业务逻辑抽象接口Presenter
*@author dahaiChang
*created at 2019/9/4 10:51
*/
public interface OtherBasePresenter extends BasePresenter<OtherBaseView>{
    void upLoadImage(String path);
}
