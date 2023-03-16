package WriteGetterAndSetterManually;


public class TestObjectWithGetAndSet {
    public static void main(String[] args) {
        Album newReleasedAlbum = new Album();
        newReleasedAlbum.setAlbumName("Sky");
        newReleasedAlbum.setArtistName("John Doe");
        newReleasedAlbum.setAlbumCountTracks(21);
        newReleasedAlbum.setAlbumSampleRate(44.1);


        System.out.println(newReleasedAlbum.getArtistName() + " just released the new album called " + newReleasedAlbum.getAlbumName() + " with a total of " + newReleasedAlbum.getAlbumCountTracks() + " tracks and all the tracks are sampled at " + newReleasedAlbum.getAlbumSampleRate() + " Hz");

        Book newBookArrival = new Book();

        newBookArrival.setBookAuthor("Mary O'Conner");
        newBookArrival.setBookTitle("Every Day");
        newBookArrival.setBookSells(230);
        newBookArrival.setBookPageCount(2134);
        System.out.println(newBookArrival.getBookAuthor() + " just released a new book called " + newBookArrival.getBookTitle() + " with an astounding " + newBookArrival.getBookPageCount() + " pages and a total of " + newBookArrival.getBookSells() + " sells.");


    }
}

