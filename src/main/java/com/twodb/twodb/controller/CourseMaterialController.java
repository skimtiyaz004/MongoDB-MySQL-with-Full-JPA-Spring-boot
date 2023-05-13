package com.twodb.twodb.controller;

import com.twodb.twodb.documents.Course;
import com.twodb.twodb.dto.CourseDTO;
import com.twodb.twodb.dto.CourseMaterialDTO;
import com.twodb.twodb.entity.CourseMaterial;
import com.twodb.twodb.service.CourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/course/material")
public class CourseMaterialController {
    @Autowired
    private CourseMaterialService courseMaterialService;
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@RequestBody CourseMaterialDTO req){
        courseMaterialService.addCourse(req);
        return new ResponseEntity<>("Data added", HttpStatus.OK);
    }
    @GetMapping("/list")
    public ResponseEntity<?> getAllMaterial(){
        List<CourseMaterial> courseMaterialList=courseMaterialService.getAllCourses();
        return new ResponseEntity<List<CourseMaterial>>(courseMaterialList, HttpStatus.OK);
    }
}
