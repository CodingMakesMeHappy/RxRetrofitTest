package com.example.hp.rxretrofittest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hp.rxretrofittest.R;
import com.example.hp.rxretrofittest.model.TableBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.http.Path;

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

    public class TableViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.table_title)
        TextView table_title;
        @BindView(R.id.table_summary)
        TextView table_summary;
        @BindView(R.id.table_image)
        ImageView table_image;

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
        TableBean.StoriesBean story = tableBean.stories.get(positionF);
        TableViewHolder tHolder = (TableViewHolder) holder;
        tHolder.table_title.setText(story.title);
        Glide.with(context).load(story.images.get(0)).into(tHolder.table_image);
    }

    @Override
    public int getItemCount() {
        if(tableBean==null||tableBean.stories==null){
            return 0;
        }
        return tableBean.stories.size();
    }
}
