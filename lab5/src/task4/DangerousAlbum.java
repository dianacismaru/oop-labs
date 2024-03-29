package task4;

public final class DangerousAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (isPrime(song.getId()))
           getSongs().add(song);
    }

    private boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
