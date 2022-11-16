package task4;

import java.util.ArrayList;

public abstract class Album {
    private final ArrayList<Song> songs = new ArrayList<>();

    abstract void addSong(Song song);

    void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
