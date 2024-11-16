package dev.sghimire.resource_server.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping(value = "/books")
    public ResponseEntity<?> getBooks(){
        var result = List.of(new Book(100,"harry pttoer"), new Book(322, "test"));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
