package Spotify;

public class Song {
    String nameOfSong;
    int duration;


    public Song(String nameOfSong,int duration) {
        this.nameOfSong = nameOfSong;
        this.duration=duration;

    }

    @Override
    public String toString() {
        return "Song{" +
                "nameOfSong='" + nameOfSong + '\'' +
                ", duration=" + duration +
                '}';
    }
}

