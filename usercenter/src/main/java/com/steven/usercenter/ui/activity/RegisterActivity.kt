package com.steven.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.steven.baselibrary.ui.activity.BaseMvpActivity
import org.jetbrains.anko.toast
import com.steven.usercenter.R
import com.steven.usercenter.R.id.mRegister
import com.steven.usercenter.presenter.RegisterPresenter
import com.steven.usercenter.presenter.view.RegisterView

import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity

class RegisterActivity : BaseMvpActivity<RegisterPresenter>() ,RegisterView{
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegister.setOnClickListener{
            mPresenter.register("","","")
        }
    }
}
