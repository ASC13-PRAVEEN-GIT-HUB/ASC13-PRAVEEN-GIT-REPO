package com.demo.service;

import com.demo.entity.VirtualEntity;


import java.util.List;

public interface VirtualService {
    List<VirtualEntity> getAllCourse();
    VirtualEntity getCourseByCourseAuthor(Long id);
    VirtualEntity addCourse(VirtualEntity Course);
    void deleteCourse(Long id);
    VirtualEntity updateCourseById(Long id,VirtualEntity existingCourse);

//    VirtualEntity getFriendByEmail(String email);
}