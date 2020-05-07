package com.cts.onlinedonation.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.onlinedonation.entity.Donation;
import com.cts.onlinedonation.repository.DonationRepository;

@Repository
@Transactional
@Component
public class DonationService {
	@PersistenceContext
  	private EntityManager entityManager;
	
	@Autowired
	public DonationRepository donationRepository;
	

	  public Donation saveproduct(Donation product) {
		  Donation savedUser=  donationRepository.save(product);
	      return savedUser;
	  }


	public Optional<Donation> getdonationById(int donationId) {
		
		return donationRepository.findById(donationId);
	}


//	public Optional<Donation> getdonationByuserIdanddnationId(int donationId, int userId) {
//	
//		return donationRepository.find(donationId,userId);
//	}


	
	  
}
