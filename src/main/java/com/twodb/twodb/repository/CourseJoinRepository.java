package com.twodb.twodb.repository;

import com.twodb.twodb.entity.CourseJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJoinRepository extends JpaRepository<CourseJoin,Long> {
}
