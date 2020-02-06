public class Album {
private String name;
private String  artist;
private int numberOfSongs;
private double playTime;

    public Album(String name, String artist, int numberOfSongs, double playTime){
        this.name = name;
        this.artist = artist;
        this.numberOfSongs = numberOfSongs;
        this.playTime = playTime;
    }
    public String toString(){
        String words = "Name: " + name + "\nArtist: " + artist + "\nNumber of Songs: " + numberOfSongs + "\nPlay Time: " + playTime;
        return words;
    }
}
