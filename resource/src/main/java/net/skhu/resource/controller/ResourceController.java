package net.skhu.resource.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ds on 2018-04-28.
 */

@RestController
public class ResourceController {

    @GetMapping("/")
    public ResponseEntity welcome() {
        return new ResponseEntity("Welcome. RESOURCE SERVER", HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity getUser(Principal user) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", user.getName());
        map.put("roles", AuthorityUtils.authorityListToSet(((Authentication)user).getAuthorities()));
        return new ResponseEntity(map, HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity postMethodTest() {
        return new ResponseEntity("RESOURCE SERVER. POST METHOD.", HttpStatus.CREATED);
    }
}
