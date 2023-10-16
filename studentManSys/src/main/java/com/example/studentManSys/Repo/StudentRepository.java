package com.example.studentManSys.Repo;

import com.example.studentManSys.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface StudentRepository extends JpaRepository<Student, Long> {


}
