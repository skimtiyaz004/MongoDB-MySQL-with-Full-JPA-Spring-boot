package com.twodb.twodb.service;

import com.twodb.twodb.entity.Students;
import com.twodb.twodb.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentsRepository studentsRepository;

    public void saveStudent(Students student) {
        studentsRepository.save(student);
    }

    public List<Students> getStudentByGuardian(String s) {
        return studentsRepository.findByGuardianEmail(s);
    }

    public Students getJPQLExample(String s) {
        return studentsRepository.getByGuardianEmail(s);
    }
}
