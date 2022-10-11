package com.pk.webhook.webhooklistener.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

@Service
public class ReceivedPosts {
    List<PostEntry> received = new ArrayList<>();

    public void addEntry(PostEntry entry) {
        received.add(entry);
    }

    public void addEntry(String entry) {
        addEntry(new PostEntry(entry));
    }

    public int size() {
        return received.size();
    }

    public List getEntries() {
        List<PostEntry> reverseList = new ArrayList<>(received);
        Collections.reverse(reverseList);
        return reverseList ;
    }

}
