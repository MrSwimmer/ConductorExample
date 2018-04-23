package com.mrswimmer.conductorexample.presentation.home;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface HomeContract {
    interface View extends MvpView {
        void showText();
    }

    interface Presenter extends MvpPresenter<View> {
        void loadData();
    }
}
