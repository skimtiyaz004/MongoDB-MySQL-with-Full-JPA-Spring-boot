package com.twodb.twodb.documents;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Course {
    @Id
    private String id;
    private String name;
}
