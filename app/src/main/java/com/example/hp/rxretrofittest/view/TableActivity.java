package com.example.hp.rxretrofittest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.rxretrofittest.R;
import com.example.hp.rxretrofittest.adapter.TableAdapter;
import com.example.hp.rxretrofittest.model.TableBean;

import butterknife.BindView;

public class TableActivity extends AppCompatActivity implements TableView {


    @BindView(R.id.table_recyclerView)
    RecyclerView table_recyclerView;

    TableBean tableBean = new TableBean();
    TableAdapter tableAdapter = new TableAdapter(this, tableBean);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        table_recyclerView.setLayoutManager(linearLayoutManager);
        table_recyclerView.setAdapter(tableAdapter);
    }

    @Override
    public void setTableData(TableBean tableBean) {
        this.tableBean.date = tableBean.date;
        this.tableBean.stories = tableBean.stories;
        this.tableBean.top_stories = tableBean.top_stories;
        tableAdapter.notifyDataSetChanged();
    }
}
