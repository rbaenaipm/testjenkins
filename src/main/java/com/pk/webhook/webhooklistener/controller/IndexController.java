package com.pk.webhook.webhooklistener.controller;

import com.pk.webhook.webhooklistener.service.ReceivedPosts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    private final ReceivedPosts received;

    public IndexController(ReceivedPosts received) {
        this.received = received;
    }


    @GetMapping("/")
    public String getIndex(Model info) {
        logger.info("in controller");
        info.addAttribute("entries", received.getEntries());
        return "index.html" ;
    }
}
