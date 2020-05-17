package com.example.demo.API;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addUser(User user){
        userService.addUser(user.getName(),user.getSurname());
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public void findUser(User user){
        userService.getUser(user.getId());
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void removeUser(User user){
        userService.removeUser(user.getId());
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody long user)
    {
        userService.getUser(user);
        ResponseEntity<String> responseEntity = new ResponseEntity("Success!", HttpStatus.NO_CONTENT);
        return responseEntity;
    }




}
