package com.example.hp.rxretrofittest.presenter;


import com.example.hp.rxretrofittest.model.TableApi;
import com.example.hp.rxretrofittest.model.TableApiClient;
import com.example.hp.rxretrofittest.model.TableBean;
import com.example.hp.rxretrofittest.model.TableCallBack;
import com.example.hp.rxretrofittest.view.TableView;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;


/**
 * Created by HP on 2017/5/19.
 */

public class TablePresenterImpl implements TablePresenter {

    TableView tableView;
    TableApiClient tableApiClient = new TableApiClient(this);
    private CompositeSubscription compositeSubscription;
    private TableApi tableApi;

    public TablePresenterImpl(TableView tableView) {
        this.tableView = tableView;

    }

    @Override
    public void loadTableData() {
        tableApiClient.loadTable();
    }

    @Override
    public void loadTableDataByRxJava() {
        System.out.println("TablePresenterImpl.loadTableDataByRxJava"+"abcde");
        tableApi = tableApiClient.rxRetrofit().create(TableApi.class);
        addSubscription(tableApi.getTableByRxJava(),
                new TableCallBack<TableBean>() {
                    @Override
                    public void onSuccess(TableBean model) {
                        System.out.println("TablePresenterImpl.onSuccess"+"abcde");
                        tableView.setTableData(model);
                    }

                    @Override
                    public void onFailure(String msg) {
                        System.out.println("TablePresenterImpl.onFailure"+"abcde");

                    }

                    @Override
                    public void onFinish() {

                    }

                    @Override
                    public void onCompleted() {

                    }
                });

    }

    @Override
    public void addSubscription(Observable observable, Subscriber subscriber) {
        if (compositeSubscription == null) {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));

    }

    @Override
    public void setTableData(TableBean tableBean) {
        tableView.setTableData(tableBean);
    }
}
