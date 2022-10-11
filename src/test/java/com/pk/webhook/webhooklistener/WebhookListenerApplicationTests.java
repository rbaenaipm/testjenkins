package com.pk.webhook.webhooklistener;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebhookListenerApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
		assertNotNull(webTestClient);
	}

	@Test
	void controllerReturnsOk() {
		webTestClient
				.post()
				.uri("/hook")
				.header("Content-Type", "application/json")
				.exchange()
				.expectStatus()
				.is2xxSuccessful();
	}





}
