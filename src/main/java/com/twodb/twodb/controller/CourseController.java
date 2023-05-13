package com.twodb.twodb.controller;

import com.twodb.twodb.documents.Course;
import com.twodb.twodb.dto.CourseDTO;
import com.twodb.twodb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@RequestBody CourseDTO req){
        Course course=new Course();
        course.setName(req.getName());
        courseService.saveCourse(course);
        return new ResponseEntity<>("Data added", HttpStatus.OK);
    }
}
