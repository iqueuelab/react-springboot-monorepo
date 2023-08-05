package com.react_springboot_monorepo.reactspringbootmonorepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String getTestMessage() {
    	LocalDateTime localDateTime = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	String formattedDateTime = localDateTime.format(formatter);
        return "Current Timestamp: " + formattedDateTime;
    }

}