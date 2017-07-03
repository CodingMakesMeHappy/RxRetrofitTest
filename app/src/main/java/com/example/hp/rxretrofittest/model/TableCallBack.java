package com.example.hp.rxretrofittest.model;

import rx.Subscriber;

/**
 * Created by HP on 2017/7/2.
 */

public abstract class TableCallBack<M> extends Subscriber<M> {

    public abstract void onSuccess(M model);

    public abstract void onFailure(String msg);

    public abstract void onFinish();

    @Override
    public void onNext(M m) {
        onSuccess(m);
    }

    @Override
    public void onError(Throwable e) {
        //check the code
    }
}
