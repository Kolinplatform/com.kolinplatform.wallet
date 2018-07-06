package com.wavesplatform.wallet.v2.ui.home.profile.network

import android.os.Bundle
import android.view.View
import javax.inject.Inject

import com.arellomobile.mvp.presenter.InjectPresenter

import com.wavesplatform.wallet.v2.ui.base.view.BaseActivity;

import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.wavesplatform.wallet.R
import kotlinx.android.synthetic.main.activity_network.*


class NetworkActivity : BaseActivity(), NetworkView {

    @Inject
    @InjectPresenter
    lateinit var presenter: NetworkPresenter

    @ProvidePresenter
    fun providePresenter(): NetworkPresenter = presenter

    override fun configLayoutRes() = R.layout.activity_network


    override fun onViewReady(savedInstanceState: Bundle?) {
        setupToolbar(toolbar_view, View.OnClickListener { onBackPressed() }, true, getString(R.string.network_toolbar_title), R.drawable.ic_toolbar_back_black)


    }

}