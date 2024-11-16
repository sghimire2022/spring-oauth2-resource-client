package dev.sghimire.client_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import static org.springframework.security.oauth2.client.web.client.RequestAttributeClientRegistrationIdResolver.clientRegistrationId;

@RestController
public class BookController {


    private final RestClient restClient;

    public BookController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping(value = "/books")
    public ResponseEntity<?> fetchBooks(){

        var result = restClient.get()
                .uri("http://localhost:8081/books")
                .attributes(clientRegistrationId("demo-client"))
                .retrieve()
                .body(String.class);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
