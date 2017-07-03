package com.example.hp.rxretrofittest.model;

import com.example.hp.rxretrofittest.presenter.TablePresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HP on 2017/7/1.
 */

public class TableApiClient {

    private String baseUrl = "http://news-at.zhihu.com/api/3/news/";
    TablePresenter tablePresenter;
    Retrofit retrofit;

    public TableApiClient(TablePresenter tablePresenter) {
        this.tablePresenter = tablePresenter;
    }

    public void loadTable() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();

        TableApi tableApi = retrofit.create(TableApi.class);
        Call<TableBean> call = tableApi.getTable();

        call.enqueue(new Callback<TableBean>() {
            @Override
            public void onResponse(Call<TableBean> call, Response<TableBean> response) {
                System.out.println("TableApiClient.onResponse" + "abcde");
                tablePresenter.setTableData(response.body());
            }

            @Override
            public void onFailure(Call<TableBean> call, Throwable t) {

            }
        });
    }

    public Retrofit rxRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
