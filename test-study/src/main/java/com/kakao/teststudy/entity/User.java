package com.kakao.teststudy.entity;


public class User {
    private String name;
    private boolean isManager = false;

    public User(final String name, final boolean isManager){
        this.isManager = isManager;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
