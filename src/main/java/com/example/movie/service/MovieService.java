package com.example.movie.service;

import com.example.movie.entity.Movie;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class MovieService {

    public static final String COL_NAME="movie";

    Firestore dbFirestore = FirestoreClient.getFirestore();

    public String saveMovieDetails(Movie movie) throws InterruptedException, ExecutionException {
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(movie.getName()).set(movie);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public Movie getMovieDetails(String name) throws InterruptedException, ExecutionException {
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(name);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        Movie movie = null;

        if(document.exists()) {
                movie = document.toObject(Movie.class);
            return movie;
        }else {
            return null;
        }
    }
}
