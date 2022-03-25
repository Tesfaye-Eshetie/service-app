package tesfayeeshetie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;

public class Television extends ServiceCommunicator {

    Television( String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

    public static void getShow (String inputTVShow) throws JsonProcessingException {
        Television TV = new Television(inputTVShow);
        TV.connect();
        String results = TV.get();

        // I add a dependence
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(results, JsonNode.class);

        // Here are some of the info I would like to print for user
        String url = jsonNode.get("url").asText();
        String name = jsonNode.get("name").asText();
        String language = jsonNode.get("language").asText();
        String officialSite = jsonNode.get("officialSite").asText();
        String summary = jsonNode.get("summary").asText();

        System.out.printf("The show you requested: %n Url: %s%n name: %s, language: %s%n" +
                " The official site: %s%n Summery: %s%n",
                url, name, language, officialSite, summary );
    }

 }
