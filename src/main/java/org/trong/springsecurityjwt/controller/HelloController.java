package org.trong.springsecurityjwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> helloUser() {
        return new ResponseEntity<>("Hello User", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> helloAdmin() {
        return new ResponseEntity<>("Hello Admin", HttpStatus.OK);
    }
}
