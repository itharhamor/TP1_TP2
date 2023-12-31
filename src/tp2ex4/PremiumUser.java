package tp2ex4;

class PremiumUser implements User{
	Playlist playlist ; 
    String username; 
    
    public PremiumUser (String username ){
        this.playlist = new Playlist(this);
        this.username = username ;  
    }
    
    @Override
    public String getUsername() {
    	return username;
    }
    public Playlist getPlaylist() {
    	return playlist;
    }
    void setUsername(String username) {
    	this.username=username;
    }

    @Override
    public void listen(Song s ){
            s.playSong();
    }
    
    @Override
    public void addToPlaylist(Song s ){
        playlist.addSong(s);
    }
    
    public void downloadOffline(Song song) {
        System.out.println("Downloading " + song.getTitle() + " for offline listening...");
    }
    
    @Override
    public void listPlaylist() {
        playlist.listPlaylist();
    }
}
