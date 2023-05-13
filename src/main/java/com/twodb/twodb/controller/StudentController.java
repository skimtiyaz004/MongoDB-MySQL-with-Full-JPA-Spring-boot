package com.twodb.twodb.controller;

import com.twodb.twodb.documents.Course;
import com.twodb.twodb.dto.CourseDTO;
import com.twodb.twodb.dto.StudentDTO;
import com.twodb.twodb.entity.Guardian;
import com.twodb.twodb.entity.Students;
import com.twodb.twodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody StudentDTO req){
        Guardian guardian= Guardian.builder()
                .name(req.getGuardian_name())
                .email(req.getGuardian_email())
                .mobile(req.getGuardian_mobile())
                .build();
        Students student=new Students();
        student.setName(req.getName());
        student.setRollNo(req.getRollNo());
        student.setCourseId(req.getCourseId());
        student.setGuardian(guardian);
        studentService.saveStudent(student);
        return new ResponseEntity<>("Data added", HttpStatus.OK);
    }
    @GetMapping("/list")
    public ResponseEntity<?> getStudent(){

        List<Students> studentsList=studentService.getStudentByGuardian("ali@gmail.com");
        return new ResponseEntity<List<Students>>(studentsList, HttpStatus.OK);

    }
    @GetMapping("/jpql")
    public ResponseEntity<?> jpqlExample(){

        Students student=studentService.getJPQLExample("ali@gmail.com");
        System.out.println("student"+student);
        return new ResponseEntity<Students>(student, HttpStatus.OK);

    }
}
