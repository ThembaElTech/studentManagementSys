package com.example.studentManSys.Repo;

import com.example.studentManSys.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
