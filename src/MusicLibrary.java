public class MusicLibrary {
    private Album[] library = new Album[10];
    private int possition = 0;
    public MusicLibrary(){
    }

    public void add(Album album){
        library[possition] = album;
        possition++;
    }

    public void remove(int removed){
        library[removed - 1] = null;
    }

    public void doubleSize(){
        int l = library.length * 2;
        Album[] newLibrary = new Album[l];
        for(int i = 0; i < newLibrary.length; i++){
            //need to finish this
        }
    }
}
