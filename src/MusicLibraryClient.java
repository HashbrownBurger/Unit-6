public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("ahhhhh", "Blaise", 10, 42.5);
        Album a5 = new Album("Big Dog", "Levi", 9, 36);
        Album a6 = new Album("Barbarossa", "Some German Guy", 12, 39.1);
        Album a7 = new Album("Overlord", "Esignhower", 69, 420);
        Album a8 = new Album("Unthinkable", "Churchil", 9, 36);
        Album a9 = new Album("Sealion", "Some German Guy", 12, 39.1);
        Album a10 = new Album("WALL-E", "Trump", 69, 420);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a3);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        myLibrary.add(a10);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Selection Sorting");
        myLibrary.sortByTitle();

        System.out.println(myLibrary);

        System.out.println("****************************************");
        System.out.println("Search for Title");

        System.out.println(myLibrary.searchTitle("Overlord"));

//        System.out.println("+++++++++++++++++++++++++++++++++++++++");
//
//        myLibrary.remove(1);
//        myLibrary.doubleSize();
//        System.out.println(myLibrary);
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++");
//
//       int ioc = myLibrary.findTitle("First");
//
//        System.out.println(myLibrary.getAlubum(ioc));
    }
}
