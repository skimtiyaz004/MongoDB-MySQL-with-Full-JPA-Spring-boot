package com.twodb.twodb.service;

import com.twodb.twodb.documents.Course;
import com.twodb.twodb.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
}
