package com.example.recodedcedan.beyondrefuge.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recodedcedan.beyondrefuge.Model.News;
import com.example.recodedcedan.beyondrefuge.R;

import java.util.List;

/**
 * Created by Recoded Cedan on 10.02.2018.
 */

public class MRecycleAdpater  extends RecyclerView.Adapter<MRecycleAdpater.MyViewHolder> {

    private List<News> newsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView listHeadline, listAuthor, listSummary;
        public ImageView listImage;

        public MyViewHolder(View view) {
            super(view);
            listHeadline = (TextView) view.findViewById(R.id.m_list_headline);
            listAuthor = (TextView) view.findViewById(R.id.m_list_author);
            listSummary = (TextView) view.findViewById(R.id.m_list_summary);
            listImage=(ImageView)view.findViewById(R.id.m_list_image);
        }
    }


    public MRecycleAdpater(List<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public MRecycleAdpater.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_item, parent, false);

        return new MRecycleAdpater.MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MRecycleAdpater.MyViewHolder holder, int position) {
        final News news = newsList.get(position);
        holder.listHeadline.setText(news.getHeadline());
        holder.listAuthor.setText(news.getAuthor());
        holder.listSummary.setText(news.getNews());
        holder.listImage.setImageResource(news.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(news.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

}
