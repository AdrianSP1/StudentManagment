package com.example.StudentManagment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagment.entity.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {

	

}
