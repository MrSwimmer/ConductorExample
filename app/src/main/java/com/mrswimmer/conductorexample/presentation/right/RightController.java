package com.mrswimmer.conductorexample.presentation.right;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.mrswimmer.conductorexample.R;
import com.mrswimmer.conductorexample.presentation.home.HomeContract;

import butterknife.ButterKnife;

public class RightController extends MvpController<RightContract.View, RightContract.Presenter> implements RightContract.View{


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_right, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @NonNull
    @Override
    public RightContract.Presenter createPresenter() {
        return new RightPresenter();
    }

    @Override
    public void showText() {

    }
}
