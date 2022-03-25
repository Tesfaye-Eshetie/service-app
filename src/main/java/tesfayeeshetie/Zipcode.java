package tesfayeeshetie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;

public class Zipcode extends ServiceCommunicator {

    public Zipcode(String zipcode) {
        super ("http://api.zippopotam.us/us/"+ zipcode);
    }

    public static void getZip (String inputZipcode) throws JsonProcessingException {
        Zipcode zip = new Zipcode(inputZipcode);
        zip.connect();
        String results = zip.get();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(results, JsonNode.class);
        String postCode = jsonNode.get("23238").asText();
        String country = jsonNode.get("country").asText();
        String place = jsonNode.get("places").asText();
        System.out.println(results);
    }
}
