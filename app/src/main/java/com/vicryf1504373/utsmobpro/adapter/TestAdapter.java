package com.vicryf1504373.utsmobpro.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vicryf1504373.utsmobpro.R;
import com.vicryf1504373.utsmobpro.model.Movie;

import java.util.ArrayList;
import java.util.List;


public class TestAdapter extends RecyclerView.Adapter<TestAdapter.MyViewHolder> {

    private final LayoutInflater layoutInflater;

    private final List<Movie> movie;



    public TestAdapter(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
        this.movie = new ArrayList<>();
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(layoutInflater.inflate(R.layout.movie_card, parent, false));
    }



    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movieList) {
        this.movie.clear();
        this.movie.addAll(movieList);
        notifyItemRangeInserted(0, movie.size());
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }


    @Override
    public int getItemCount(){
        return movie.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, userrating;
        ImageView image;

        public MyViewHolder(View view){

            super(view);
            title = (TextView) view.findViewById(R.id.title);
            userrating = (TextView) view.findViewById(R.id.userrating);
            view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                }
            });
        }
    }
}