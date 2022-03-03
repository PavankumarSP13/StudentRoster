package com.pavan.StudentRoaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.StudentRoaster.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
