package com.example.StudentManagment.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.StudentManagment.service.StudentService;

@Controller 
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//Metodo para manejar la lista de estudiantes y retornar al model and view
	@GetMapping
	public String ListStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}

}
