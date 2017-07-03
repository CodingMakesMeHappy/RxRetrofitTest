package com.example.hp.rxretrofittest.presenter;

import com.example.hp.rxretrofittest.model.TableBean;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by HP on 2017/5/19.
 */

public interface TablePresenter {
    void loadTableData();

    void loadTableDataByRxJava();

    void addSubscription(Observable observable, Subscriber subscriber);

    void setTableData(TableBean tableBean);
}
