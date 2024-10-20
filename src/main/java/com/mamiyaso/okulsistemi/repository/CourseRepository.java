// CourseRepository.java
package com.mamiyaso.okulsistemi.repository;

import com.mamiyaso.okulsistemi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByTeacherId(Long teacherId);
}