package com.eltayeb.bookingsystem.controller;

import com.eltayeb.bookingsystem.model.ServiceModel;
import com.eltayeb.bookingsystem.service.ServiceManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceManagementService serviceManagementService;

    @PostMapping
    public ResponseEntity<ServiceModel> saveService(@RequestBody ServiceModel service) {
        ServiceModel savedService = serviceManagementService.save(service);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedService);
    }

    @GetMapping
    public ResponseEntity<List<ServiceModel>> findAllServices() {
        List<ServiceModel> services = serviceManagementService.findAll();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceModel> findServiceById(@PathVariable Long id) {
        return serviceManagementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceModel> updateService(@PathVariable Long id, @RequestBody ServiceModel serviceModel) {
        try {
            ServiceModel updatedService = serviceManagementService.update(id, serviceModel);
            return ResponseEntity.ok(updatedService);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServiceById(@PathVariable Long id) {
        try {
            serviceManagementService.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
