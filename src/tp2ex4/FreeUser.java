package tp2ex4;

class FreeUser implements User{
    private String username ; 
    private Playlist playlist; 
    public FreeUser (String username){
    	this.username=username;
        this.playlist = new Playlist(this); 
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
    public void viewAds() {
        System.out.println("Enjoy free content with ads.");
    }
    
    @Override
    public void listen(Song s ){
    		this.viewAds();
            s.playSong();
    }
    
    @Override
    public void addToPlaylist(Song s ){
    	if (playlist.size() < 1) {
            playlist.addSong(s);
            System.out.println("Added to playlist: " + s.getTitle());
        } else {
            System.out.println("‼ Playlist is full ‼. Upgrade to Premium for unlimited playlist.");
        }
    }
    
    @Override
    public void listPlaylist(){
        playlist.listPlaylist();
    }
}
