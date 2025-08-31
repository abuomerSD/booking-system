package com.eltayeb.bookingsystem.repositories;

import com.eltayeb.bookingsystem.model.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceModel, Long> {
}
