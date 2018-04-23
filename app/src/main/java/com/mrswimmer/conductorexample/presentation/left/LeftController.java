package com.mrswimmer.conductorexample.presentation.left;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.mrswimmer.conductorexample.R;
import com.mrswimmer.conductorexample.presentation.home.HomeContract;
import com.mrswimmer.conductorexample.presentation.right.RightContract;

import butterknife.ButterKnife;

public class LeftController extends MvpController<LeftContract.View, LeftContract.Presenter> implements LeftContract.View {

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_left, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @NonNull
    @Override
    public LeftContract.Presenter createPresenter() {
        return new LeftPresenter();
    }

    @Override
    public void showText() {

    }


}


