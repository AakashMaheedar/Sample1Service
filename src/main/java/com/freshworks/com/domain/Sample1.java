package com.freshworks.com.domain;

public class Sample1 {

    private final long id;
    private final String content;

    public Sample1(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
