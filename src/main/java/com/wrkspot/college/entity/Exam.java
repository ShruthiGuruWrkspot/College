package com.wrkspot.college.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Examination")
public class Exam {
    @Id
    @GeneratedValue
    @Column(name = "Exam_Code")
    private int examCode;
    @Column(name = "Name_of _the_Course")
    private String courseName;
    @Column(name = "Date_of_Exam")
    private Date date;
    @Column(name = "Session_of_Exam")
    private String session;
    @Column(name = "Room_number")
    private int roomNo;
}
