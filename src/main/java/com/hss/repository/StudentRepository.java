package com.hss.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.hss.dto.StudentRegistrationDTO;


public interface StudentRepository extends JpaRepository<StudentRegistrationDTO,Integer> {

	
}
