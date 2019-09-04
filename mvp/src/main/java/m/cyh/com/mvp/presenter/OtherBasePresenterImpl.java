package m.cyh.com.mvp.presenter;

import m.cyh.com.mvp.view.OtherBaseView;
/**
* OtherActivity业务逻辑实现
*@author dahaiChang
*created at 2019/9/4 10:51
*/
public class OtherBasePresenterImpl implements OtherBasePresenter{

    private OtherBaseView otherBaseView;
    @Override
    public void upLoadImage(String path) {

    }

    @Override
    public void attachView(OtherBaseView v) {
        this.otherBaseView = v;
    }

    @Override
    public void detachView() {
        otherBaseView = null;
    }
}
