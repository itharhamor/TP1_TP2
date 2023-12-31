package tp2ex4;

import java.util.ArrayList;

class Album {
	private Artist artist ; 
    private String albumName ; 
    private ArrayList <Song> tracks=new ArrayList<Song>(); 

    public Album(String albumName , Artist artist){
        this.albumName = albumName; 
        this.artist = artist;
        
    }
    public Artist getArtist() {
    	return artist;
    }
    public String getAlbumName() {
    	return albumName;
    }
    public ArrayList <Song> getTracks(){
    	return tracks;
    }

    public void addTrack(Song s){
        if (s.getArtist() == this.artist){
            this.tracks.add(s); 
        }
        else {
            System.out.println("Song " + s.toString() + "does not belong to artist " + this.artist.getArtistName());

        }

    }

    public void removeTrack(Song s ){
        this.tracks.remove(s) ;
    }

    public void listAllTracks(){
        System.out.println("Songs in the '" + this.albumName + "' by " + this.artist.getArtistName()+":"); 
        for (Song s : this.tracks){
            System.out.println(s.toString());
        }
    }
}
