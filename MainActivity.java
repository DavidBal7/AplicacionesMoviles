package com.david.myfragmentsist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapters.AlbumAdapter;
import models.Album;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumAdapter albumAdapter;

    private List<Album> albums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerview);

        albums = new ArrayList<>();
        albums.add(new Album("Microdosis","Mora","Reggaeton",R.drawable.portadamicrodosis));
        albums.add(new Album("X100PRE","Bad Bunny","Reggaeton",R.drawable.portadabadbunny));
        albums.add(new Album("Legendaddy","Daddy Yankee","Reggaeton",R.drawable.legendaddy));
        albums.add(new Album("Afrodisiaco", "Rauw Alejandro","Reggaeton",R.drawable.albumafrodisiaco));
        albums.add(new Album("YHLQMDLG","Bad Bunny","Reggaeton",R.drawable.albumyhlqmdlg));
        albums.add(new Album("Starboy","The Weekend", "Pop",R.drawable.albumstarboy));
        albums.add(new Album("Fearless","Taylor Swift","Pop",R.drawable.albumfearless));
        albums.add(new Album("Climaxxx","Dalex","Reggaeton",R.drawable.albumclimaxxx));
        albums.add(new Album("Odisea","Ozuna","Reggaeton",R.drawable.albumodisea));
        albums.add(new Album("Estrella","Mora","Reggaeton",R.drawable.albumestrella));
        /*albums.add(new Album("","","",R.drawable.));
        albums.add(new Album("","","",R.drawable.));
        albums.add(new Album("","","",R.drawable.));*/
        albumAdapter = new AlbumAdapter(albums,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(albumAdapter);

    }
}
