package com.olly.springboot.basespringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    public ResponseEntity<String> doGet() {
		logger.debug("doGet()");
		return ResponseEntity.ok("get response");
	}
}