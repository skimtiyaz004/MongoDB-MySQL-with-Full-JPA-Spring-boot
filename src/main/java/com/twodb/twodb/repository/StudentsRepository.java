package com.twodb.twodb.repository;

import com.twodb.twodb.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Long> {
    List<Students> findByGuardianEmail(String s);
    //JPQL

    @Query("select s from Students s where s.guardian.email = ?1")
    Students getByGuardianEmail(String s);
}
