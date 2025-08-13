package com.demo.repository;

import com.demo.entity.VirtualEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirtualRepository extends JpaRepository<VirtualEntity,Long> {
    VirtualEntity findByCourseAuthor(String courseAuthor);

}
