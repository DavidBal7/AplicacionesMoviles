package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.david.myfragmentsist.R;

import java.util.List;

import models.Album;
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    private List<Album> albums;

    private Context context;

    public AlbumAdapter(List<Album> albums, Context context){
        this.albums = albums;
        this.context= context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.album_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Album album = albums.get(position);
        holder.setAlbumData(album);
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCover;
        private TextView tvTitle, tvArtist, tvGenre;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            imgCover = itemView.findViewById(R.id.albumcover);
            tvTitle = itemView.findViewById(R.id.Tituloalbum);
            tvArtist = itemView.findViewById(R.id.nombreart);
            tvGenre = itemView.findViewById(R.id.genero);

        }
        public void setAlbumData( Album album){
            imgCover.setImageResource(album.getCoverResourceId());
            tvTitle.setText(album.getTitle());
            tvArtist.setText(album.getArtista());
            tvGenre.setText(album.getGenero());
        }

    }

}
