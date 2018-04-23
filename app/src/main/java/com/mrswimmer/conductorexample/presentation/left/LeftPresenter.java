package com.mrswimmer.conductorexample.presentation.left;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.mrswimmer.conductorexample.presentation.home.HomeContract;
import com.mrswimmer.conductorexample.presentation.right.RightContract;

public class LeftPresenter extends MvpBasePresenter<LeftContract.View> implements LeftContract.Presenter {

    LeftPresenter() {
        //loadData();

    }

    @Override
    public void loadData() {
        getView().showText();
    }
}
