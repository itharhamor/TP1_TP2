package tp2ex4;

class Song {
	public int length ; //In seconds
    public String title ; 
    public Artist artist ; 

    public Song(Artist artist , int length , String name){
        this.title = name; 
        this.artist = artist ; 
        this.length= length ; 
    }
    public String getTitle() {
    	return title;
    }
    public int getLength(){
    	return this.length; 
    }
    public Artist getArtist(){
    	return this.artist ;
    }
    void setTitle(String title) {
    	this.title=title;
    }
    void setLength(int length) {
    	this.length=length;
    }
    void setArtist(Artist artist) {
    	this.artist=artist;
    }
    
    public void playSong(){
        System.out.println("\n♫-------Playing-------♫:\n " + this.title + " by: " + this.artist.getArtistName()+"\n"); 
    }
    @Override
    public String toString(){
        return "♪"+this.title + "♪ by: " + artist.getArtistName(); 
    }
    
}
