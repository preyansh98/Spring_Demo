package com.safehome.springdemo.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController is what tells Spring that this class is the controller.
@RestController
public class UserController {

    //This makes a GET call to /hello, which will return a 200 Http Response with the text "Hi there".
    //Try this out in your browser once you run the application!
    @GetMapping("/hello")
    public ResponseEntity<String> sampleAPI(){
        return new ResponseEntity<>("Hi there", HttpStatus.OK);
    }

    /*IMPLEMENT REGISTRATION CONTROLLER METHOD HERE*/

    /*IMPLEMENT LOGIN CONTROLLER METHOD HERE */

    /*IMPLEMENT VIEWLOGGEDINUSERS CONTROLLER METHOD HERE */
}
