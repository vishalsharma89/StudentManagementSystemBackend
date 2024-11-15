package com.codes.studentsystem.service;

import com.codes.studentsystem.model.Student;
import com.codes.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();


}
