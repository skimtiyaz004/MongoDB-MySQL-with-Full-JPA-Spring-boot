package com.twodb.twodb.entity;

import com.twodb.twodb.documents.Course;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String rollNo;
    private String courseId;
    @Embedded
    private Guardian guardian;

}
