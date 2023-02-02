package com.wrkspot.college.controller;

import com.wrkspot.college.entity.Student;
import com.wrkspot.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.addAllStudents(students);
    }
    @GetMapping("/getAllStudents")
    public List<Student>getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/getStudent/{regNumber}")
    public Student getStudentByID(@PathVariable int regNumber) {
        return studentService.getStudentByID(regNumber);
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updaStudent(student);
    }
    @DeleteMapping("/deleteStudent/{regNumber}")
    public String deleteByID(@PathVariable int regNumber) {
        return studentService.deleteByID(regNumber);
    }
}
