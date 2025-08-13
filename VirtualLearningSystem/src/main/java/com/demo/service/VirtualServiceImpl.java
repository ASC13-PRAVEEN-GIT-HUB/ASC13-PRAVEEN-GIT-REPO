package com.demo.service;

import com.demo.entity.VirtualEntity;
import com.demo.repository.VirtualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class VirtualServiceImpl implements VirtualService {

    private final VirtualRepository virtualRepository;

    @Autowired
    public VirtualServiceImpl(VirtualRepository virtualRepository) {
        this.virtualRepository = virtualRepository;


    }

    @Override
    public List<VirtualEntity> getAllCourse() {
        return virtualRepository.findAll();
    }

    @Override
    public VirtualEntity getCourseByCourseAuthor(Long id) {
        return virtualRepository.getById(id);
    }

    @Override
    public VirtualEntity addCourse(VirtualEntity Course) {
        return virtualRepository.save(Course);
    }

    @Override
    public void deleteCourse(Long id) {
        virtualRepository.deleteById(id);

    }

    @Override
    public VirtualEntity updateCourseById(Long id, VirtualEntity existingCourse) {
        VirtualEntity virtualEntity = virtualRepository.getById(id);
        virtualEntity.setCourseName(existingCourse.getCourseName());
        virtualEntity.setCourseAuthor(existingCourse.getCourseAuthor());
        virtualEntity.setDurationInHour(existingCourse.getDurationInHour());
        virtualEntity.setAvailability(existingCourse.getAvailability());
        return virtualRepository.save(virtualEntity);
    }
}

