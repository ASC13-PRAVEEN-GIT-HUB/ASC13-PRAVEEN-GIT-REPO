package com.demo.service;

import com.demo.entity.Dost;
import com.demo.repository.DostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class DostServiceImpl implements DostService{

    private final DostRepository dostRepository;
    @Autowired
    public DostServiceImpl(DostRepository dostRepository){
        this.dostRepository=dostRepository;
    }

    @Override
    public List<Dost> getAllFriends() {
        return dostRepository.findAll();
    }

    @Override
    public Dost getFriendById(Long id) {
        return dostRepository.getById(id);
    }

    @Override
    public Dost addFriend(Dost friend) {
        return dostRepository.save(friend);
    }

    @Override
    public void deleteFriend(Long id) {
        dostRepository.deleteById(id);

    }

    @Override
    public Dost updateFriendById(Long id, Dost existingFriend) {
        Dost dost=dostRepository.getById(id);
        dost.setFirstName(existingFriend.getFirstName());
        dost.setLastName(existingFriend.getLastName());
        dost.setAge(existingFriend.getAge());
        dost.setEmail(existingFriend.getEmail());
        return dostRepository.save(dost);
    }

    @Override
    public Dost getFriendByEmail(String email) {
      return  dostRepository.findByEmail(email);
    }
}
