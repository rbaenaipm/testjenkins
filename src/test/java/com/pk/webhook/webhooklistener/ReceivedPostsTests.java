package com.pk.webhook.webhooklistener;

import com.pk.webhook.webhooklistener.service.PostEntry;
import com.pk.webhook.webhooklistener.service.ReceivedPosts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceivedPostsTests {

    @Test
    void growsWithEntry() {
        ReceivedPosts posts = new ReceivedPosts();
        assertEquals(0, posts.size() );
        posts.addEntry(new PostEntry(new Date(), "one"));

        assertEquals(1, posts.size()) ;
    }

    @Test
    void returnsLatestFirst() {
        ReceivedPosts posts = new ReceivedPosts();
        posts.addEntry(new PostEntry("one"));
        posts.addEntry(new PostEntry("two"));
        List<PostEntry> results = posts.getEntries();

        assertEquals(2, results.size());
        assertEquals("two", results.get(0).getBody());
        assertEquals("one", results.get(1).getBody());

    }
}
