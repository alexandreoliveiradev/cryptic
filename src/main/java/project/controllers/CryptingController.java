package project.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.main.java.services.Crypt;

@RestController
public class CryptingController {


    private Crypt service;

    @PostMapping("/encrypter")
    public ResponseEntity<String> encrypt(@RequestBody String text){
        service = new Crypt();

        return new ResponseEntity<>(service.encryptText(text), HttpStatus.OK);

    }

    @PostMapping("/decrypter")
    public ResponseEntity<String> decrypt(@RequestBody String text){

        service = new Crypt();

        return new ResponseEntity<>(service.decryptText(text), HttpStatus.OK);
    }

}
