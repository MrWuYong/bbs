package com.wh.usermanger.controller;

import com.wh.usermanger.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("用户操作接口")
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> user(@PathVariable("id") int id){
        return new ResponseEntity<>(userService.findUserById(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseEntity<Object> root(){
        return new ResponseEntity<>("123456789", HttpStatus.OK);
    }
}
