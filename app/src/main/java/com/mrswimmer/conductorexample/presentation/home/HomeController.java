package com.mrswimmer.conductorexample.presentation.home;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.hannesdorfmann.mosby3.mvp.conductor.MvpController;
import com.mrswimmer.conductorexample.R;
import com.mrswimmer.conductorexample.presentation.left.LeftController;
import com.mrswimmer.conductorexample.presentation.right.RightController;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeController extends MvpController<HomeContract.View, HomeContract.Presenter> implements HomeContract.View {

    @BindView(R.id.left)
    Button left;
    @BindView(R.id.right)
    Button right;
    @BindView(R.id.home_container)
    ViewGroup homeContainer;

    private Router router;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_home, container, false);
        ButterKnife.bind(this, view);
        router = getChildRouter(homeContainer);
        return view;
    }

    @NonNull
    @Override
    public HomeContract.Presenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    public void showText() {
        //button.setText("LOL");
    }

    @OnClick(R.id.right)
    void onRightClick() {
        router.replaceTopController(RouterTransaction.with(new RightController()));
        Log.i("code", "backstack size " + router.getBackstackSize());
    }

    @OnClick(R.id.left)
    void onLeftClick() {
        router.replaceTopController(RouterTransaction.with(new LeftController()));
        Log.i("code", "backstack size " + router.getBackstackSize());
    }
}


