package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.movieModel.MovieModel;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    List<MovieModel> movieList;

    public MovieAdapter(List<MovieModel> movieList) {
        this.movieList = movieList;
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView movie_poster;
        TextView box_office_ranking, movie_name, box_office_total;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            movie_poster = itemView.findViewById(R.id.movie_poster);
            movie_name = itemView.findViewById(R.id.movie_name);
            box_office_ranking = itemView.findViewById(R.id.box_office_ranking);
            box_office_total = itemView.findViewById(R.id.box_office_total);
        }
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.movie_name.setText(movieList.get(position).getName());
        holder.box_office_ranking.setText(String.valueOf(movieList.get(position).getRanking()));
        holder.box_office_total.setText(String.valueOf(movieList.get(position).getTotal()));
        holder.movie_poster.setImageResource(movieList.get(position).getImage());
    }


    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
