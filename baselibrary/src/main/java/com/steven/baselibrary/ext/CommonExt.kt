package com.steven.baselibrary.ext

import com.steven.baselibrary.rx.BaseSubcriber
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.kotlin.bindToLifecycle
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


fun <T> Observable<T>.execute(subscriber: BaseSubcriber<T>,lifecycleProvider: LifecycleProvider<*>){
     this.observeOn(AndroidSchedulers.mainThread())
             .compose(lifecycleProvider.bindToLifecycle())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}