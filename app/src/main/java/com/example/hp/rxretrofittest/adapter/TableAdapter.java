package com.example.hp.rxretrofittest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hp.rxretrofittest.R;
import com.example.hp.rxretrofittest.model.TableBean;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HP on 2017/5/19.
 */

public class TableAdapter extends RecyclerView.Adapter {

    Context context;
    TableBean tableBean;

    public TableAdapter(Context context, TableBean tableBean) {
        this.context = context;
        this.tableBean = tableBean;
    }

    private class TableViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.table_title)
        TextView table_title;
        @BindView(R.id.table_summary)
        TextView table_summary;

        public TableViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_table, parent, false);
        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final int positionF = position;
    }

    @Override
    public int getItemCount() {
        return tableBean.stories.size();
    }
}
