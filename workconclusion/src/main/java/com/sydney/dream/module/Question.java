package com.sydney.dream.module;

import java.util.Date;

/**
 * Created by Sydney on 2017/1/18.
 */
public class Question {
    private int id;
    private Date createDate;
    private Date updateDate;
    private String description;
    private String sulution;
    private int status;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSulution() {
        return sulution;
    }

    public void setSulution(String sulution) {
        this.sulution = sulution;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", description='" + description + '\'' +
                ", sulution='" + sulution + '\'' +
                ", status=" + status +
                '}';
    }
}
