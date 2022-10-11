package com.pk.webhook.webhooklistener.controller;

import com.pk.webhook.webhooklistener.service.ReceivedPosts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {

    Logger logger = LoggerFactory.getLogger(WebController.class);

    private ReceivedPosts received ;

    public WebController(ReceivedPosts received) {
        this.received = received;
    }



    @RequestMapping(value = "/hook", method = POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> greetingJson(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        // json contains the plain json string
        logger.info(json) ;
        received.addEntry(json) ;
        return ResponseEntity.status(HttpStatus.OK).body("Received") ;

    }
}
