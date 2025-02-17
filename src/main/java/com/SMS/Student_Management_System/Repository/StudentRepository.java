package com.SMS.Student_Management_System.Repository;

import com.SMS.Student_Management_System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
