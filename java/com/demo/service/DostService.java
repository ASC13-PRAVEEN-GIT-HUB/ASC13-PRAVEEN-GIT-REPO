package com.demo.service;

import com.demo.entity.Dost;


import java.util.List;

public interface DostService {
    List<Dost> getAllFriends();
    Dost getFriendById(Long id);
    Dost addFriend(Dost friend);
    void deleteFriend(Long id);
    Dost updateFriendById(Long id,Dost existingFriend);

    Dost getFriendByEmail(String email);
}