package net.skhu.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-04-28.
 */

@RestController
public class APIGatewayController {

    @GetMapping("/")
    public ResponseEntity server1() {
        return new ResponseEntity("Welcome. GATEWAY SERVER.", HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity server2() {
        return new ResponseEntity("success.", HttpStatus.CREATED);
    }
}