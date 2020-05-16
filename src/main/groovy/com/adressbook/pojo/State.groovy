package com.adressbook.pojo;

public enum State {
    ALASKA("AK", "Alaska"),
    ARIZONA("AZ", "Alaska"),
    ARKANSAS("AR","Arkansas"),
    CALIFORNIA("CA", "California"),
    COLORADO("CO", "Colorado");

    State(String code, String name) {
        this.code = code
        this.name = name
    }

    String code
    String name
}
