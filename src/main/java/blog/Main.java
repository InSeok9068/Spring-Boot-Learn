package blog;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> mapConstructor = new HashMap<>();
        mapConstructor.put("name", "홍길동");
        mapConstructor.put("age", "19");

        Map<String, Object> mapBuilder = ImmutableMap.<String, Object>builder()
                .put("name", "홍길동")
                .put("age", "19")
                .build();

        List<Integer> numberListConstructor = new ArrayList<>();
        numberListConstructor.add(1);
        numberListConstructor.add(2);

        List<Integer> listBuilder = ImmutableList.<Integer>builder()
                .add(1)
                .add(2)
                .build();

//		ImmutableMap, ImmutableList
    }
}
