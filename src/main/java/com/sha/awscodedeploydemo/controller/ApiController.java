package com.sha.awscodedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController
{
    @GetMapping("/")
    public ResponseEntity<?> sayHello()
    {
        return ResponseEntity.ok("hello world spring-boot");
    }
    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("It works successfully.");
    }
}
