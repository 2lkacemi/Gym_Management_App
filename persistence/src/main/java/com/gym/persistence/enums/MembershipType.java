package com.gym.persistence.enums;

public enum MembershipType {
    BASIC("Basic"),
    PREMIUM("Premium");

    private final String name;

    MembershipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
