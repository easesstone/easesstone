package com.sydney.dream.module;

import java.util.Date;

/**
 * Created by Sydney on 2017/1/19.
 */
public class Work {
    private int id;
    private Date workDate;  // 工作日
    private String workContent; //工作计划
    private String workStatus;  // 工作进展
    private String nextPlan;  // 计划
    private String conclusion;  //工作总结

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

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getNextPlan() {
        return nextPlan;
    }

    public void setNextPlan(String nextPlan) {
        this.nextPlan = nextPlan;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Work() {
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", workDate=" + workDate +
                ", workContent='" + workContent + '\'' +
                ", workStatus=" + workStatus +
                ", nextPlan='" + nextPlan + '\'' +
                ", conclusion='" + conclusion + '\'' +
                '}';
    }
}