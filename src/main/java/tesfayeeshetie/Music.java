package tesfayeeshetie;

public class Music extends ServiceCommunicator{

    Music(String songTitleOrArtistName){
        super("https://itunes.apple.com/search?term=" + songTitleOrArtistName + "&limit=1");
    }

    public static void getMusic (String inputTitleOrArtistName) {
        Music song = new Music(inputTitleOrArtistName);
        song.connect();
        System.out.println(song.get());
    }
}
