package com.SMS.Student_Management_System.Service;

import com.SMS.Student_Management_System.Entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}