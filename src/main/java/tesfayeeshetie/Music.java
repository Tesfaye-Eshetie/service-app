package tesfayeeshetie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;

public class Music extends ServiceCommunicator{

    Music(String songTitleOrArtistName){
        super("https://itunes.apple.com/search?term=" + songTitleOrArtistName + "&limit=1");
    }

    public static <MyClass> void getMusic (String inputTitleOrArtistName) throws JsonProcessingException {
        Music song = new Music(inputTitleOrArtistName);
        song.connect();
        String results = song.get();
        System.out.println(results);
    }
}
