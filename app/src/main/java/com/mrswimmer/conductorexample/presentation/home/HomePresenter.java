package com.mrswimmer.conductorexample.presentation.home;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

public class HomePresenter extends MvpBasePresenter<HomeContract.View> implements HomeContract.Presenter {

    HomePresenter() {
        //loadData();

    }

    @Override
    public void loadData() {
        getView().showText();
    }
}
