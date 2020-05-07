package com.cts.onlinedonation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.onlinedonation.entity.Donation;
import com.cts.onlinedonation.service.DonationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value="The DonationController", description="Rest controller for order")
public class DonationController {
	
	@Autowired
	public DonationService donationService;
	
	@ApiOperation(value="Post all donations",
			  produces="A list of donations",
			  notes="Hit this URL to post all donation details"
			  )
	  @PostMapping("/donation")
	    public void addProduct(@RequestBody Donation product) {
	        donationService.saveproduct(product);    
	    }
	
	@ApiOperation(value="Retrieve all donations",
			  produces="A list of donationdetails",
			  notes="Hit this URL to get all donation details"
			  )
	   @RequestMapping("donation/{donationId}")
		public Optional<Donation> getById(@PathVariable int donationId) {
			return donationService.getdonationById(donationId);
		}
	   
//	   @RequestMapping("donation/{donationId}/{userId}")
//		public Optional<Donation> getById(@PathVariable int donationId ,@PathVariable int userId) {
//			return donationService.getdonationByuserIdanddnationId(donationId,userId);
//		}
	   
	   
			
			
		}
	
	

