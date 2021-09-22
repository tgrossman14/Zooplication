package com.zapp.zooplication.data.model;

import java.util.Date;

public class Suggestion {

    private String category;
    private String content;
    private Date submitted;
    private boolean confidential;

    public Suggestion(String category, String content, Date submitted, boolean confidential) {
        this.category = category;
        this.content = content;
        this.submitted = submitted;
        this.confidential = Suggestion.this.confidential;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }

    public boolean getConfidential() {
        return confidential;
    }

    public void setConfidential(boolean confidential) {
        this.confidential = confidential;
    }
}
