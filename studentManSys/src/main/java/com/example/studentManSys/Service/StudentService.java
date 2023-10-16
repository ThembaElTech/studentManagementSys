package com.example.studentManSys.Service;

import com.example.studentManSys.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
