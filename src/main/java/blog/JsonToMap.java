package blog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonToMap {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"a\" : \"1\"}";

        Map<String, String> map1 = new ObjectMapper().readValue(json, Map.class);
        System.out.println(map1);
        Map<String, String> map2 = new ObjectMapper().readValue(json, new TypeReference<Map<String, String>>() {
        });
        System.out.println(map1);
        Map<String, String> map3 = new ObjectMapper().readValue(json, new TypeReference<>() {
        });
        System.out.println(map1);
    }
}
