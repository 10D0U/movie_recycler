package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerview.adapter.MovieAdapter;
import com.example.recyclerview.databinding.ActivityMainBinding;
import com.example.recyclerview.movieModel.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<MovieModel> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.list_item);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        movieList = new ArrayList<>();
        MovieModel movie_1 = new MovieModel(R.drawable.movie_1, 1, "Barbie", 155.0);
        MovieModel movie_2 = new MovieModel(R.drawable.movie_2, 2, "Oppenheimer", 80.5);
        MovieModel movie_3 = new MovieModel(R.drawable.movie_3, 3, "Sound of Freedom", 20.1);
        MovieModel movie_4 = new MovieModel(R.drawable.movie_4, 4, "Mission: Impossible", 19.5);
        MovieModel movie_5 = new MovieModel(R.drawable.movie_5, 5, "Indiana Jones", 6.7);

        movieList.add(movie_1);
        movieList.add(movie_2);
        movieList.add(movie_3);
        movieList.add(movie_4);
        movieList.add(movie_5);

        MovieAdapter movieAdapter = new MovieAdapter(movieList);
        binding.recyclerView.setAdapter(movieAdapter);
    }
}