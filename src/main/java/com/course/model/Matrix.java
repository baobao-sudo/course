package com.course.model;

import java.io.Serializable;

public class Matrix implements Serializable {
    private Integer matrixId;

    private Integer typeId;

    private Integer courseId;

    private Integer count;

    private Integer firstRequirementId;

    private Integer secondRequirementId;

    private Double weight;

    private static final long serialVersionUID = 1L;

    public Integer getMatrixId() {
        return matrixId;
    }

    public void setMatrixId(Integer matrixId) {
        this.matrixId = matrixId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFirstRequirementId() {
        return firstRequirementId;
    }

    public void setFirstRequirementId(Integer firstRequirementId) {
        this.firstRequirementId = firstRequirementId;
    }

    public Integer getSecondRequirementId() {
        return secondRequirementId;
    }

    public void setSecondRequirementId(Integer secondRequirementId) {
        this.secondRequirementId = secondRequirementId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", matrixId=").append(matrixId);
        sb.append(", typeId=").append(typeId);
        sb.append(", courseId=").append(courseId);
        sb.append(", count=").append(count);
        sb.append(", firstRequirementId=").append(firstRequirementId);
        sb.append(", secondRequirementId=").append(secondRequirementId);
        sb.append(", weight=").append(weight);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}