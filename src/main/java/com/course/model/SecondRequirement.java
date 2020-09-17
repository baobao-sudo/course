package com.course.model;

import java.io.Serializable;

public class SecondRequirement implements Serializable {
    private Integer id;

    private Integer firstRequirementId;

    private Integer secondRequirementId;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", firstRequirementId=").append(firstRequirementId);
        sb.append(", secondRequirementId=").append(secondRequirementId);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}