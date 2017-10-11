package com.aya.spring.springdemomaven.model;

import lombok.*;

@Getter
public class StackoverflowWebsite {
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;

    public StackoverflowWebsite(String id, String website, String iconImageUrl, String title, String description) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.title = title;
        this.description = description;
    }
}
