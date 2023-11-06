package models;

public class Album {
    private String title;
    private String artista;
    private String genero;
    private int coverResourceId;

    public Album(String title, String artista, String genero, int coverResourceId) {
        this.title = title;
        this.artista = artista;
        this.genero = genero;
        this.coverResourceId = coverResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCoverResourceId() {
        return coverResourceId;
    }

    public void setCoverResourceId(int coverResourceId) {
        this.coverResourceId = coverResourceId;
    }
}
