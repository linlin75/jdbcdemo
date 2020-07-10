package com.neusoft.entity;

public class Student {
    private Integer stuNo;
    private String StuName;
    private String StuMajor;

    public Student() {
    }

    public Student(Integer stuNo, String stuName, String stuMajor) {
        this.stuNo = stuNo;
        StuName = stuName;
        StuMajor = stuMajor;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getStuMajor() {
        return StuMajor;
    }

    public void setStuMajor(String stuMajor) {
        StuMajor = stuMajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", StuName='" + StuName + '\'' +
                ", StuMajor='" + StuMajor + '\'' +
                '}';
    }
}
