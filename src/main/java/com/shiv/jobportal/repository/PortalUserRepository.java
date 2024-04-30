package com.shiv.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiv.jobportal.dto.PortalUser;

public interface PortalUserRepository extends JpaRepository<PortalUser,Integer>
{

	boolean existsByEmailAndVerifiedTrue(String email);

	PortalUser findByEmail(String email);

	PortalUser findByMobile(long mobile);

	boolean existsByMobileAndVerifiedTrue(long mobile);

	List<PortalUser> findByRecruiterDetailsNotNull();

}
