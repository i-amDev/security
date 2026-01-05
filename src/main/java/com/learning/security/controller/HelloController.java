package com.learning.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
//    @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/admin/hello")
    public String sayAdminHello() {
        return "Hello, Admin.";
    }

    @GetMapping("/user/hello")
    public String sayUserHello() {
        return "Hello, User.";
    }
}
