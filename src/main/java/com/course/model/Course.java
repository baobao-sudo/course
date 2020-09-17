package com.course.model;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private Integer courseId;

    private Integer grade;

    private Integer credit;

    private String major;

    private String name;

    private Integer term;

    private Integer status;

    private Date computeTime;

    private static final long serialVersionUID = 1L;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getComputeTime() {
        return computeTime;
    }

    public void setComputeTime(Date computeTime) {
        this.computeTime = computeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", grade=").append(grade);
        sb.append(", credit=").append(credit);
        sb.append(", major=").append(major);
        sb.append(", name=").append(name);
        sb.append(", term=").append(term);
        sb.append(", status=").append(status);
        sb.append(", computeTime=").append(computeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}