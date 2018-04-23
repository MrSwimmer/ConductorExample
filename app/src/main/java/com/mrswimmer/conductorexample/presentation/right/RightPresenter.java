package com.mrswimmer.conductorexample.presentation.right;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.mrswimmer.conductorexample.presentation.home.HomeContract;

public class RightPresenter extends MvpBasePresenter<RightContract.View> implements RightContract.Presenter {

    RightPresenter() {
        //loadData();

    }

    @Override
    public void loadData() {
        getView().showText();
    }
}
