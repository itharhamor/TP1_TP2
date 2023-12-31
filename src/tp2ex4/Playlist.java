package tp2ex4;

import java.util.ArrayList;
import java.util.Collections;

class Playlist {
    ArrayList<Song> songs= new ArrayList<>() ; 
    User user ; 

    public Playlist(User user ){
        this.user = user;	    
    }
    public User getUser() {
    	return user;
    }
    public ArrayList<Song> getSongs() {
    	return songs;
    }
    public int size() {
    	return songs.size();
    }
    public void setUser(User user) {
    	this.user=user;
    }

    public void addSong(Song s ){
        songs.add(s); 
    }

    public void removeSong(Song s ){
       songs.remove(s) ; 
    }

    public void shufflePlaylist(){
        Collections.shuffle(this.songs); 
    }

    public void listPlaylist(){
        System.out.println("♬Songs in " + this.user.getUsername()+"'s playlist: "); 
        for (Song s : this.songs)
            System.out.println(s.toString());
    }
}
