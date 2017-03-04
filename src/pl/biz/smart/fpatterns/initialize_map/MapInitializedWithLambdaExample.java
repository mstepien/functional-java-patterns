package pl.biz.smart.fpatterns.initialize_map;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.AbstractMap.SimpleEntry;

public class MapInitializedWithLambdaExample {

    public static void main(String[] args) {

        Map<Integer, String> map = Collections.unmodifiableMap(Stream.of(
                new SimpleEntry<>(0, "zero"),
                new SimpleEntry<>(1, "one"),
                new SimpleEntry<>(2, "two"),
                new SimpleEntry<>(3, "three"))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
        
        System.out.println("Map initialized the functional way: " + String.valueOf(map));

    }

}
