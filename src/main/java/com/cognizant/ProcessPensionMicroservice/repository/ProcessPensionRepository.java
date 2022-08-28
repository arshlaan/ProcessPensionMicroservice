package com.cognizant.ProcessPensionMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ProcessPensionMicroservice.model.PensionDetail;

@Repository
public interface ProcessPensionRepository extends JpaRepository<PensionDetail, Integer> {

}
