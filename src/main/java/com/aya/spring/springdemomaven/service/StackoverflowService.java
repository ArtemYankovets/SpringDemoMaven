package com.aya.spring.springdemomaven.service;

import com.aya.spring.springdemomaven.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StackoverflowService {

    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchange)",
                "for professionals and enthusiast programmers"));
        items.add(new StackoverflowWebsite("serverfault", "http://serverfault.com",
                "http://cdn.sstatic.net/Sites/serverfault/img/favicon.ico", "Server Fault (StackExchange)",
                "for system and network administrators"));
        items.add(new StackoverflowWebsite("superuser", "http://superuser.com",
                "http://cdn.sstatic.net/Sites/superuser/img/favicon.ico", "Super User (StackExchange)",
                "for computer enthusiasts and power user"));
        items.add(new StackoverflowWebsite("askubuntu", "http://askubuntu.com",
                "http://cdn.sstatic.net/Sites/askubuntu/img/favicon.ico", "Ask Ubuntu (StackExchange)",
                "for Ubuntu users and Developers"));
        items.add(new StackoverflowWebsite("apple", "http://apple.stackexchange.com",
                "http://cdn.sstatic.net/Sites/apple/img/favicon.ico", "Ask Different (StackExchange)",
                "for power users of Apple hardware and software"));
        items.add(new StackoverflowWebsite("android", "http://android.stackexchange.com",
                "http://cdn.sstatic.net/Sites/android/img/favicon.ico", "Android Enthusiasts (StackExchange)",
                "for enthusiasts and power users of the Android operating system"));
    }

    public List<StackoverflowWebsite> findAll() {
        return Collections.unmodifiableList(items);
    }
}
