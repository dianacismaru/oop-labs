package task4;

public final class ThrillerAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (song.getComposer().compareTo("Michael Jackson") == 0 && song.getId() % 2 == 0)
            getSongs().add(song);
    }
}
