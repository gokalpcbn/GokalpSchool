package com.students;

import com.project.superhuman.Human;

public class Student extends Human {
    private String StudentId;


    public Student(int userId, String studentId){
        super(userId);
        this.StudentId = studentId;
    }

    public Student(){
        super();
    }

    public Student(int userId){
        super(userId);
    }

    public String getStudentId(){
        return StudentId;
    }

    public void setTeacherId(){
        this.StudentId = StudentId;
    }
}
