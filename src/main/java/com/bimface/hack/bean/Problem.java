package com.bimface.hack.bean;

import java.util.Date;

public class Problem {
    private Long id;
    private String name;
    private String content;
    private Reporter reporter;
    private Date reportTime;

    public Problem() {
    }

    public Problem(Long id, String name, String content, Reporter reporter, Date reportTime) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.reporter = reporter;
        this.reportTime = reportTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }
}
