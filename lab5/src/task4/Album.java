package task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> songs = new ArrayList<>();
    abstract void addSong(Song song);

    // Useless but required
    void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }
}
