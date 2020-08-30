package io.test;

import java.util.Arrays;
import java.util.List;

public class AnagramPojo {

    private Integer id;
    List<String> words;

    public AnagramPojo() {
    }

    public AnagramPojo(List<String> words) {
        this.words = words;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "AnagramPojo{" +
                "id=" + id +
                ", words=" + words +
                '}';
    }
}
