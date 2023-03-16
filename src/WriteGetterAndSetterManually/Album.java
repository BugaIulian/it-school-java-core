package WriteGetterAndSetterManually;

class Album {
    private String albumName;
    private String artistName;
    private int albumCountTracks;
    private double albumSampleRate;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getAlbumCountTracks() {
        return albumCountTracks;
    }

    public void setAlbumCountTracks(int albumCountTracks) {
        this.albumCountTracks = albumCountTracks;
    }

    public double getAlbumSampleRate() {
        return albumSampleRate;
    }

    public void setAlbumSampleRate(double albumSampleRate) {
        this.albumSampleRate = albumSampleRate;
    }
}
