package Spotify;

import java.util.ArrayList;

public class Album {
     ArrayList<Song> album;

     String artist;

    public Album(String artist) {
        album=new ArrayList<>();
        this.artist=artist;
    }

    public boolean searchByTitle(String title){
         if(album.contains(title)){
             return true;
         }return false;
     }
   public String addSongToAlbum(String title,int duration){
         if(!searchByTitle(title)){
             Song song=new Song(title,duration);
             album.add(song);
             return "Song added to album";
         }else{
             return "This Song already exists";
         }
     }
     public String deleteSonginAlbum(String title){
        if(!searchByTitle(title)){
            return "Song doesnt exists";
        }else{
            album.remove(title);
        }
        return "Song Deleted from Album";
     }
     public void displayALlSongsInAlbum(){
        for(Song song:album){
            System.out.println(song);
        }
     }
}
