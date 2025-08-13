package com.demo.repository;

import com.demo.entity.Dost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DostRepository extends JpaRepository<Dost,Long> {
    Dost findByEmail(String email);

}
