package tp2ex4;

class MainMusic {
	public static void main(String[] args) {
		
        // Creating Artists
        Artist artist1 = new Artist("Artist1");
        Artist artist2 = new Artist("Artist2");

        // Creating Albums and songs
        Album album1 = new Album("Album1", artist1);
        Album album2 = new Album("Album2", artist2);

        Song song1 = new Song(artist1, 180, "Song1");
        Song song2 = new Song(artist2, 200, "Song2");

        album1.addTrack(song1);
        album2.addTrack(song2);

        // Creation of different types of users
        FreeUser freeUser = new FreeUser("FreeUser");
        PremiumUser premiumUser = new PremiumUser("PremiumUser");

        // Tests for free user
        freeUser.listen(song1);
        freeUser.addToPlaylist(song1);
        freeUser.addToPlaylist(song2);

        freeUser.listPlaylist();

        // Tests for premium user
        premiumUser.listen(song2);
        premiumUser.addToPlaylist(song2);
        premiumUser.downloadOffline(song2);

        premiumUser.listPlaylist();
	}
}
