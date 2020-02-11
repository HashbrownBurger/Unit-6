public class MusicLibrary {
    private Album[] library = new Album[10];

    public MusicLibrary() {
    }

    public boolean add(Album album) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = album;
                return true;
            }
        }
        return false;
    }

    public void remove(int removed) {
        library[removed - 1] = null;
    }

    public void doubleSize() {
        int l = library.length * 2;
        Album[] newLibrary = new Album[l];
        for (int i = 0; i < library.length; i++) {
            newLibrary[i] = library[i];
        }
        library = newLibrary;
    }

    public String toString() {
        String answer = "";
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null)
                answer += library[i].toString();
        }
        return answer;
    }

    public int findTitle(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].getName().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void sortByTitle() {
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan].getName() != null && library[min].getName() != null) {
                    if (library[scan].getName().compareTo(library[min].getName()) < 0) {
                        min = scan;
                    }

                    temp = library[min];
                    library[min] = library[i];
                    library[i] = temp;
                }
            }
        }
    }

    public void artistSort(){
        for (int i = 0; i < library.length; i++) {
            Album key = library[i];
            int position = i;

            while (position > 0 && library[position - 1].getArtist().compareTo(key.getArtist()) > 0 && library[position].getName() != null && library[i].getName() != null){
                library[position] = library[position - 1];
                position--;
            }
            library[position] = key;
        }
    }

    public int searchTitle(String target){
        int low = 0, high = library.length-1, middle = (low + high)/2;

        while (library[middle].getName().equals(target) && low <= high){
            if (target.compareTo(library[middle].getName()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high)/2;
        }

        if (library[middle].getName().equals(target))
            return middle;
        else
            return -1;
    }

    public int searchArtist(String target){
        int low = 0, high = library.length-1, middle = (low + high)/2;

        while (library[middle].getArtist().equals(target) && low <= high){
            if (target.compareTo(library[middle].getArtist()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high)/2;
        }

        if (library[middle].getArtist().equals(target))
            return middle;
        else
            return -1;
    }






    public Album getAlubum(int index){
        return library[index];
    }
        }


