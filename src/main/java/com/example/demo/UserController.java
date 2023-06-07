package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    public int save(@RequestBody User User){
        return userService.save(User);
    }

    @GetMapping("/getuser/{id}")
    public User readID(@PathVariable int id){
        return userService.findById(id);
    }

    @DeleteMapping("/user/{id}/delete")
    public int delete(@PathVariable int id) {
        userService.delete(id);
        return id;
    }

    @PostMapping("/update/{id}")
    public int update(@PathVariable int id, @RequestBody User user){
        return userService.update(id, user);
    }

    @PutMapping("/put/{id}")
    public int put(@PathVariable int id, @RequestBody User user){
        return userService.put(id, user);
    }
}