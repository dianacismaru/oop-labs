package task4;

public class ThrillerAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (song.getComposer().compareTo("Michael Jackson") == 0 && song.getId() % 2 == 0)
            songs.add(song);
    }
}
