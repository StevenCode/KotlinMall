package com.steven.baselibrary.ext

import com.steven.baselibrary.rx.BaseSubcriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


fun <T> Observable<T>.execute(subscriber: BaseSubcriber<T>){
     this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}