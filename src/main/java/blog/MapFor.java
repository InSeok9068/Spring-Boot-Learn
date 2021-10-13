package blog;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class MapFor {
    public static void main(String[] args) {
        Map<String,Object> map = ImmutableMap.<String,Object>builder()
                .put("1번",1)
                .put("2번",2)
                .put("3번",3)
                .build();

        for(Map.Entry<String,Object> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }
    }
}
