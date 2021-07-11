package com.mohanty.springcache.model;

public enum Major {

    PHYSICS("physics"),
    CHEMISTRY("chemistry"),
    MATHS("maths"),
    BIOLOGY("biology");

    private String value;
    private Major(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
