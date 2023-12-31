package tp2ex4;

import java.util.ArrayList;

class Artist {
	private String artistName ; 
    private ArrayList<Album> discography=new ArrayList<>() ; 
    
    public Artist (String artistName ){
        this.artistName = artistName;
    }
    public String getArtistName() {
    	return artistName;
    }
    public ArrayList<Album> getDiscography() {
    	return discography;
    }
    public void addAlbum(Album a ){
        if (a.getArtist() == this ){
            this.discography.add(a) ; 
        }
        else {
            System.out.println("Album " + a.getAlbumName() + "does not belong to artist " + this.artistName);
        }
 
    }

    public void DeleteAlbum(Album a ){
        this.discography.remove(a); 
    }

    public void ListDiscorgraphy(){
        System.out.println("Discorgraphy of " + this.artistName);
        if (this.discography != null ){
            for (Album a : this.discography){
                a.listAllTracks();
            }
        }
        

    }
}
