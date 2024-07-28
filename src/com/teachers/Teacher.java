package com.teachers;

import com.project.superteacher.Humanteach;

public class Teacher extends Humanteach {
    private String teacherId;


    public Teacher(int userId, String teacherId) {
        super(userId);
        this.teacherId = teacherId;
    }

    public Teacher(){
        super();
    }

    public String getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
