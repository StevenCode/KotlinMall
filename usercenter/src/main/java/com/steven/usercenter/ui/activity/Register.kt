package com.steven.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.jetbrains.anko.toast
import com.steven.usercenter.R

import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mRegister.setOnClickListener{
//                Toast.makeText(this,"注册",Toast.LENGTH_SHORT).show()
            toast("Hi there!")
//            startActivity(intentFor<TestActivity>("id" to 5))
//            startActivity<TestActivity>(("id" to 10))
        }
    }
}
