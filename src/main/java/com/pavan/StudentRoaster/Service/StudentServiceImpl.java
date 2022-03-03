package com.pavan.StudentRoaster.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.pavan.StudentRoaster.Model.Student;
import com.pavan.StudentRoaster.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepo) {
		
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> findById(long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Object deleteById(long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		return "deleted";
	}
	

}
