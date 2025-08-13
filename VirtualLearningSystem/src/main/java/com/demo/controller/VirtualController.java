package com.demo.controller;

import com.demo.entity.VirtualEntity;
import com.demo.service.VirtualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class VirtualController {
    private final VirtualService virtualService;
    @Autowired
    public VirtualController(VirtualService virtualService) {
        this.virtualService = virtualService;
    }
    @GetMapping("/courses")
    List<VirtualEntity>getAllCourse(){
        return virtualService.getAllCourse();
    }

    @PostMapping("/addCourse")
    VirtualEntity addCourse(@RequestBody VirtualEntity Course){
        return virtualService.addCourse(Course);
    }
    @DeleteMapping("/delete/{id}")
    void deleteCourse(@PathVariable Long id){
        virtualService.deleteCourse(id);
    }
    @PutMapping("/update/{id}")
    VirtualEntity updatingCourse(@PathVariable Long id,@RequestBody VirtualEntity updateCourse){
        return virtualService.updateCourseById(id,updateCourse);
    }

}