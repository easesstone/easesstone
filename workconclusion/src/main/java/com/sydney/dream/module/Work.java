package com.sydney.dream.module;

import java.util.Date;

/**
 * Created by Sydney on 2017/1/19.
 */
public class Work {
    private int id;
    private Date workDate;
    private String workContent;
    private int workStatus;
    private String nextPlan;
    private String questionId;
    private String knowledgeId;

    public Work() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public int getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(int workStatus) {
        this.workStatus = workStatus;
    }

    public String getNextPlan() {
        return nextPlan;
    }

    public void setNextPlan(String nextPlan) {
        this.nextPlan = nextPlan;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", workDate=" + workDate +
                ", workContent='" + workContent + '\'' +
                ", workStatus=" + workStatus +
                ", nextPlan='" + nextPlan + '\'' +
                ", questionId='" + questionId + '\'' +
                ", knowledgeId='" + knowledgeId + '\'' +
                '}';
    }
}
