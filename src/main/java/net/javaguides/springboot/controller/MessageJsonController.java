package net.javaguides.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.dto.User;
import net.javaguides.springboot.publisher.RabbitMQJsonProducer;

@RestController
@RequestMapping("api/v2")
public class MessageJsonController {

	private RabbitMQJsonProducer rabbitMQJsonProducer;

	public MessageJsonController(RabbitMQJsonProducer rabbitMQJsonProducer) {
		this.rabbitMQJsonProducer = rabbitMQJsonProducer;
	}

	@PostMapping("/publish")
	public ResponseEntity<String> sendJSONMessage(@RequestBody User user) {
		rabbitMQJsonProducer.sendJsonMessage(user);
		return ResponseEntity.ok("Json Message sent to Rabbit MQ");
	}

}
