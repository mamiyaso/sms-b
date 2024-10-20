// TeacherRepository.java
package com.mamiyaso.okulsistemi.repository;

import com.mamiyaso.okulsistemi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByEmail(String email);
}