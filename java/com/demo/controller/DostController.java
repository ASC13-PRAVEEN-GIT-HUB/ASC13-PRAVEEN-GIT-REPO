package com.demo.controller;

import com.demo.entity.Dost;
import com.demo.service.DostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dost")
public class DostController {
    private final DostService dostService;
    @Autowired
    public DostController(DostService dostService) {
        this.dostService = dostService;
    }
    @GetMapping("/friends")
    List<Dost>getAllfriends(){
    return dostService.getAllFriends();
    }
//    @GetMapping("/{id}")
//    Dost getFriendById(@PathVariable Long id){
//        return dostService.getFriendById(id);
//    }
@GetMapping("/{email}")
Dost getFriendById(@PathVariable String email){
    return dostService.getFriendByEmail(email);
}
    @PostMapping("/addfriend")
    Dost addFriend(@RequestBody Dost friend){
        return dostService.addFriend(friend);
    }
    @DeleteMapping("/delete/{id}")
    void deleteFriend(@PathVariable Long id){
        dostService.deleteFriend(id);
    }
    @PutMapping("/update/{id}")
    Dost updatingFriend(@PathVariable Long id,@RequestBody Dost updateFriend){
        return dostService.updateFriendById(id,updateFriend);
    }

}
