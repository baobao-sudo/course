package com.course.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Score implements Serializable {
    private Integer stuNo;

    private Integer courseId;

    private BigDecimal totalScore;

    private static final long serialVersionUID = 1L;

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuNo=").append(stuNo);
        sb.append(", courseId=").append(courseId);
        sb.append(", totalScore=").append(totalScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}