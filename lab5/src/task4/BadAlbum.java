package task4;

public final class BadAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if (song.getName().length() == 3 && isPalindrome(song.getId()))
            getSongs().add(song);
    }

    private boolean isPalindrome(int n) {
        int nCopy = n;
        int rev = 0;

        while (nCopy != 0) {
            rev = rev * 10 + nCopy % 10;
            nCopy /= 10;
        }
        return n == rev;
    }
}
