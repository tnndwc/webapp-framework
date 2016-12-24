package com.xframework.repository;

import com.xframework.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Len on 18/12/2016.
 */
@Repository
public interface StuRepository extends JpaRepository<Student, Integer> {
}
