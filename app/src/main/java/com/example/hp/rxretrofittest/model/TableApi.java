package com.example.hp.rxretrofittest.model;

import rx.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HP on 2017/7/1.
 */

public interface TableApi {
    @GET("latest")
    Call<TableBean> getTable();
    @GET("latest")
    Observable<TableBean> getTableByRxJava();
}
