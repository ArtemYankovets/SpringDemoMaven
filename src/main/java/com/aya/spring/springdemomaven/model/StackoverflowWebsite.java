package com.aya.spring.springdemomaven.model;

import lombok.*;

@Getter
@Setter
public class StackoverflowWebsite {
    private final String id;
    private final String iconImageUrl;
    private final String website;
    private final String title;
    private final String description;

    public StackoverflowWebsite(String id, String iconImageUrl, String website, String title, String description) {
        this.id = id;
        this.iconImageUrl = iconImageUrl;
        this.website = website;
        this.title = title;
        this.description = description;
    }
}
