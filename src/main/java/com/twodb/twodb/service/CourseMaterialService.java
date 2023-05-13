package com.twodb.twodb.service;

import com.twodb.twodb.dto.CourseMaterialDTO;
import com.twodb.twodb.entity.CourseJoin;
import com.twodb.twodb.entity.CourseMaterial;
import com.twodb.twodb.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialService {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    public void addCourse(CourseMaterialDTO req) {
        CourseJoin courseJoin=CourseJoin.builder()
                .title(req.getTitle())
                .credit(req.getCredit())
                .build();
        CourseMaterial courseMaterial=CourseMaterial.builder()
                .courseJoin(courseJoin)
                .url(req.getUrl())
                .build();
        courseMaterialRepository.save(courseMaterial);
    }

    public List<CourseMaterial> getAllCourses() {
        return courseMaterialRepository.findAll();
    }
}
