package com.marktony.zhihudaily.open_source_license;

import com.marktony.zhihudaily.interfaces.BasePresenter;
import com.marktony.zhihudaily.interfaces.BaseView;

/**
 * Created by Lizhaotailang on 2016/9/3.
 * This specifies the contract between the view and the presenter.
 */

public interface OpenSourceListenContract {

    interface View extends BaseView<Presenter> {

        void loadLicense(String path);

    }

    interface Presenter extends BasePresenter {

        void showLicense();

    }

}
