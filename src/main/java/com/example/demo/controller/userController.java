package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import  com.example.demo.user.userDetails;

import java.util.*;

@RestController
@RequestMapping("api")
public class userController {

    Map<Long, userDetails> userInfo = new HashMap<>();

    @GetMapping
    List<userDetails> getAlluser() {
        return new ArrayList<>(userInfo.values());
    }
    @PostMapping
    Collection<userDetails> getSingleUser(@RequestBody userDetails userIfo){
         userInfo.put(userIfo.getId(),userIfo);
         return userInfo.values();
    }
    @PutMapping("/id/{Id}")
    public userDetails updateSingleUser(@PathVariable("Id") Long Id, @RequestBody userDetails userDetail) {
        // Update the user in the map
        userInfo.put(Id, userDetail);

        // Return the updated user details
        return userDetail;
    }
}
