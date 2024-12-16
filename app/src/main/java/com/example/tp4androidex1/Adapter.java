package com.example.tp4androidex1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Movie> moviesList;
    //constructor
    public Adapter (List<Movie> moviesList){
        this.moviesList=moviesList;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Movie m = moviesList.get(position);

        holder.nom.setText(m.getNom());
        holder.annee.setText(m.getAnnee());
        holder.genre.setText(m.getGenre());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nom;
        public TextView annee;
        public TextView genre;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.Name);
            annee = itemView.findViewById(R.id.Year);
            genre = itemView.findViewById(R.id.Genre);
        }

    }.
}
