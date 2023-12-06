package Week_10.FourthTask;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

class Song {
    private String title;
    private String artist;
    private String genre;
    public Song(String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
class GenreFilterIterator implements Iterator<Song>
{
    private List<Song> playlist;
    private String target;
    int i = 0;
    public GenreFilterIterator(List<Song> playlist, String target){
        this.playlist = new ArrayList<>();
        this.target = target;
    }
    @Override
    public boolean hasNext(){
        boolean result = false;
        for(i = 0; i< playlist.size();i++){
            if(playlist.get(i).getGenre().equals(target)){
                result = true;
            }
            else result = false;
        }
        return result;
    }
    @Override
    public Song next(){
        if(!hasNext()){
            throw new NoSuchElementException("No more songs");
        }
        return playlist.get(i++);

    }

}
class MainSong
{
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song 1", "Artist 1", "Pop"));
        playlist.add(new Song("Song 2", "Artist 2", "Rock"));
        playlist.add(new Song("Song 3", "Artist 3", "Pop"));
        playlist.add(new Song("Song 4", "Artist 4", "Hip-hop"));
        playlist.add(new Song("Song 5", "Artist 5", "Rock"));

    }
}
