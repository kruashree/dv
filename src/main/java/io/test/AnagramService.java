package io.test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AnagramService implements AnagramInterface {

    String[] words = {"loop","pool","polo"};
    HashMap<Integer, AnagramPojo> anagramHashMap = new HashMap<>();

    Integer id = 1;



    @Override
    public List<AnagramPojo> getAllwords() {
        AnagramPojo anagramPojo = new AnagramPojo();
       List<String> list = Arrays.stream(words)
                .map(s -> s.toCharArray())
                .map(chars -> { Arrays.sort(chars); return new String(chars); })
                .collect(Collectors.toList());
        anagramPojo.setId(id);
        anagramPojo.setWords(list);
        anagramHashMap.put(id,anagramPojo);

        return new ArrayList<>(anagramHashMap.values());
    }


}
