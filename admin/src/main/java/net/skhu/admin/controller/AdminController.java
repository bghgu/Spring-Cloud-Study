package net.skhu.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by ds on 2018-04-28.
 */

@RestController
public class AdminController {

    @GetMapping("/")
    public ResponseEntity welcome() {
        return new ResponseEntity("Welcome. ADMIN SERVER", HttpStatus.OK);
    }

    @PostMapping("/time")
    public ResponseEntity getTiem() {
        return new ResponseEntity(LocalDateTime.now(), HttpStatus.CREATED);
    }
}
