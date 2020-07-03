package com.tobias.saul.rsocketdemo.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.tobias.saul.rsocketdemo.data.Message;

@Controller
public class RSocketController {
	
	static final String SERVER = "server";
	static final String RESPONSE = "response";
	
	@MessageMapping("request-response")
	Message requestResponse(Message request) {
		System.out.println("Receivced: " + request);
		
		return new Message(SERVER, RESPONSE);
	}

}
