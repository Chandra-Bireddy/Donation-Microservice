package com.cts.onlinedonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.onlinedonation.entity.Donation;

public interface DonationRepository  extends JpaRepository<Donation ,Integer> {
	
    // @Query(value =" Select* from Donation d where d.donationId:=donationId AND d.userId:=userId")
//	Optional<Donation> find(int donationId, int userId);

	

}
