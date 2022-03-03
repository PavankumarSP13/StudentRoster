package com.pavan.StudentRoaster.Service;

import java.util.List;
import java.util.Optional;

import com.pavan.StudentRoaster.Model.Student;



public interface StudentService {
	
	List<Student> findAllStudent();
	Optional<Student> findById(long id);
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Object deleteById(long id);
	

}
