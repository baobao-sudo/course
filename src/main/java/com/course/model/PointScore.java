package com.course.model;

import java.io.Serializable;

public class PointScore implements Serializable {
    private Integer pointScoreId;

    private Integer courseId;

    private Integer studentNo;

    private Integer secondRequirementId;

    private Double pointScore;

    private static final long serialVersionUID = 1L;

    public Integer getPointScoreId() {
        return pointScoreId;
    }

    public void setPointScoreId(Integer pointScoreId) {
        this.pointScoreId = pointScoreId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Integer getSecondRequirementId() {
        return secondRequirementId;
    }

    public void setSecondRequirementId(Integer secondRequirementId) {
        this.secondRequirementId = secondRequirementId;
    }

    public Double getPointScore() {
        return pointScore;
    }

    public void setPointScore(Double pointScore) {
        this.pointScore = pointScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pointScoreId=").append(pointScoreId);
        sb.append(", courseId=").append(courseId);
        sb.append(", studentNo=").append(studentNo);
        sb.append(", secondRequirementId=").append(secondRequirementId);
        sb.append(", pointScore=").append(pointScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}