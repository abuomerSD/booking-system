package com.eltayeb.bookingsystem.service;

import com.eltayeb.bookingsystem.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eltayeb.bookingsystem.model.ServiceModel;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceManagementService {
    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceModel save(ServiceModel service) {
        return serviceRepository.save(service);
    }

    public List<ServiceModel> findAll() {
        return serviceRepository.findAll();
    }

    public Optional<ServiceModel>  findById(Long id) {
        return serviceRepository.findById(id);
    }

    public ServiceModel update(Long id, ServiceModel serviceModel) throws Exception {
        if (!serviceRepository.existsById(id)){
            throw new Exception("Service Not Found");
        }
        serviceModel.setId(id);
        return serviceRepository.save(serviceModel);
    }

    public Optional<ServiceModel> deleteById(Long id) throws Exception {
        Optional<ServiceModel> serviceModel = serviceRepository.findById(id);
        if(serviceModel.isEmpty()) {
            throw new Exception("Service Not Found");
        }
        serviceRepository.deleteById(id);
        return serviceModel;
    }
}
