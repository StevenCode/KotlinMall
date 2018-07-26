package com.steven.baselibrary.rx

import rx.Subscriber

open class BaseSubcriber<T>: Subscriber<T>() {
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}