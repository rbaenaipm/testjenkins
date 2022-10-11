package com.pk.webhook.webhooklistener.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PostEntry {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM HH:mm:ss");

    private final Date timestamp ;
    private final String body;

    public PostEntry(Date timestamp, String body) {
        this.timestamp = timestamp;
        this.body = body;
    }

    public PostEntry(String body)  {
        this(new Date(), body);
    }

    public String getFormattedTime() {
        return dateFormat.format(timestamp);
    }

    public String getBody() {
        return body;
    }
}
