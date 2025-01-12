package com.kodtodya.practice.enums;

public enum Level {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private String level;

    Level(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
