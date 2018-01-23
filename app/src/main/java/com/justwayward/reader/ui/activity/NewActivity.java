package com.justwayward.reader.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.justwayward.reader.R;
import com.justwayward.reader.base.BaseActivity;
import com.justwayward.reader.component.AppComponent;
import com.justwayward.reader.manager.CollectionsManager;
import com.justwayward.reader.utils.ToastUtils;

import butterknife.Bind;
import butterknife.OnClick;

public class NewActivity extends BaseActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_new;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }


    @OnClick(R.id.btnLocalBook)
    public void onClickJoinCollection() {
//        Toast.makeText(this, "Button", Toast.LENGTH_LONG).show();
        ScanLocalBookActivity.startActivity(this);
    }

    @Override
    public void initToolBar() {
        //mCommonToolbar.setNavigationIcon(R.drawable.ab_back);
        mCommonToolbar.setTitle(R.string.book_local);
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void configViews() {

    }
}
