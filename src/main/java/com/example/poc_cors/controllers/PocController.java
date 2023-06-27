package com.example.poc_cors.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {
    @PostMapping("/cors")
    public ResponseEntity<Object> poc(){
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
