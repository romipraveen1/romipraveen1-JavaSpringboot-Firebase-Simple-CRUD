package com.example.movie;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class MovieApplication {

    public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = MovieApplication.class.getClassLoader();
//
//        File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
//        FileInputStream serviceAccount= new FileInputStream(file.getAbsoluteFile());
//
//
//
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        FirebaseApp.initializeApp(options);

//        FileInputStream serviceAccount =
//                new FileInputStream("src/main/resources/serviceAccountKey.json");

//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        FirebaseApp.initializeApp(options);

//        FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
//                .setDatabaseUrl("[DATABASE_URL]")
//                .setServiceAccountId("API_KEY")
//                .set
////                .setApiKey("API_KEY")
//                .setApplicationId("PROJECT_ID").build();


//        FirebaseApp myApp = FirebaseApp.initializeApp(getApplicationContext(),firebaseOptions,
//                "MyAppName");
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//        FirebaseApp.initializeApp(options);

//        FileInputStream serviceAccount =
//                new FileInputStream("path/to/serviceAccountKey.json");
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        FirebaseApp.initializeApp(options);
        SpringApplication.run(MovieApplication.class, args);
    }

}
