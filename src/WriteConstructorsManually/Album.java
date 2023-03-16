package WriteConstructorsManually;

 class Album {
    private String albumName;
    private String artistName;
    private int albumTracks;
    private double albumSampleRate;
    private int albumBitDepth;

    public Album(String albumName, String artistName, int albumTracks, double albumSampleRate, int albumBitDepth) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.albumTracks = albumTracks;
        this.albumSampleRate = albumSampleRate;
        this.albumBitDepth = albumBitDepth;
    }
}
