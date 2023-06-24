package Spotify;

public class Main {
    public static void main(String[] args) {
        Album album1=new Album("Hariharan");
        album1.addSongToAlbum("anbe anbe",4);
        album1.addSongToAlbum("Nila Kaigirathu",5);
        album1.addSongToAlbum("En jeevan",3);
        album1.addSongToAlbum("vennmegam",5);
        album1.displayALlSongsInAlbum();
    }
}