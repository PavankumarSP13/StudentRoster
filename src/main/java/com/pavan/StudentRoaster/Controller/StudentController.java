package com.pavan.StudentRoaster.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.StudentRoaster.Model.Student;
import com.pavan.StudentRoaster.Service.StudentService;


@RestController
@RequestMapping("/Student")
public class StudentController {
	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> findAllStudent()
	{
		return studentService.findAllStudent();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> findById(@PathVariable("id") long id)
	{
	 return studentService.findById(id);
	}

	@PostMapping
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int id) {
	studentService.deleteById(id);
	}


	}