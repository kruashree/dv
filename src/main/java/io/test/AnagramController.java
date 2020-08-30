package io.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/anagram")
public class AnagramController {


    private AnagramInterface anagramInterface;

    public AnagramController(AnagramInterface anagramInterface) {
        this.anagramInterface = anagramInterface;
    }

    @GetMapping
    public ResponseEntity<List<AnagramPojo>> getAllAnagramWords()  {
       // return new ResponseEntity(anagramSolver.mainApp(), HttpStatus.OK);
        //anagramService.getAllwords();

        List<AnagramPojo> list = anagramInterface.getAllwords();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
