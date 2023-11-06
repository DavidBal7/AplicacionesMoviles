package com.david.myfragmentsist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import models.Album;

public class Albumitem extends Fragment {
    private TextView Tituloalbum,nombreart,genero;

    private ImageView albumcover;
    private Album album;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.album_item,container,false);

        Tituloalbum = view.findViewById(R.id.Tituloalbum);
        nombreart = view.findViewById(R.id.nombreart);
        genero = view.findViewById(R.id.genero);
        albumcover=view.findViewById(R.id.albumcover);

        albumcover.setImageResource(this.album.getCoverResourceId());
        Tituloalbum.setText(album.getTitle());
        nombreart.setText(album.getArtista());
        genero.setText(album.getGenero());

        return view;
    }
}
