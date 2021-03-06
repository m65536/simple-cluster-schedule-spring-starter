package com.mo.schedule.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @description: 任务
 * @author: MoXingwang 2018-08-11 12:30
 **/
public class Task implements Serializable {
    /**
     * 指定唯一
     */
    private String taskId;
    private String taskName;
    private String taskClassName;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskClassName() {
        return taskClassName;
    }

    public void setTaskClassName(String taskClassName) {
        this.taskClassName = taskClassName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }


}
