package com.wrkspot.college.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue
    @Column(name = "CourseID", unique = true)
    private int courseID;
    @Column(name = "Course_Name")
    private String courseName;
    @Column(name = "Duration_of_Course")
    private int duration;
    @Column(name = "Subjects")
    private String subjects;
}
