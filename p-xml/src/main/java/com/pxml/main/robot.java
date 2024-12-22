package com.pxml.main;

import org.springframework.stereotype.Component;

@Component
public class robot {
    private  String name;

    public robot() {
        this.name = "yoee-ccc";
    }
    public robot(String name) {
        this.name = "yoee";
    }

    public String getName() {
        return name;
    }
}
