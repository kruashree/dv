package io.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class AnagramApp {

    @Bean
    AnagramInterface anagramInterface(){
        return new AnagramService();
    }


    public static void main(String[] args) throws IOException {
        SpringApplication.run(AnagramApp.class, args);

    }

}
