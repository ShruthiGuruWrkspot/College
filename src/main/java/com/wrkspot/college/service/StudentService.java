package com.wrkspot.college.service;

import com.wrkspot.college.entity.Student;
import com.wrkspot.college.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> addAllStudents(List<Student> students) {
        return studentRepo.saveAll(students);
    }


    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentByID(int regNumber) {
        return studentRepo.findById(regNumber).orElse(null);
    }

    public String deleteByID(int regNumber) {
        studentRepo.deleteById(regNumber);
        return "Student deleted";
    }
}