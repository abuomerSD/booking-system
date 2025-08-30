package com.eltayeb.bookingsystem.controller;

import com.eltayeb.bookingsystem.model.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @PostMapping
    public ResponseEntity<Service> saveService(@RequestBody Service service) {
        return  ResponseEntity.ok(service);
    }
}
