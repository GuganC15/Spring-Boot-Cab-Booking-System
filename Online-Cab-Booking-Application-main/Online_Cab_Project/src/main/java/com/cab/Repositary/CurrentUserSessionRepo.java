package com.cab.Repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cab.Model.CurrentUserSession;

@Repository
public interface CurrentUserSessionRepo extends JpaRepository<CurrentUserSession , Integer>{

	Optional<CurrentUserSession> findByUuid(String uuid);
	
	@Query("SELECT c FROM CurrentUserSession c WHERE c.uuid = :uuid AND c.currRole = 'admin'")
	Optional<CurrentUserSession> findByUuidAndRole(@Param("uuid") String uuid);
	
//	@Query("SELECT c FROM CurrentUserSession c WHERE c.uuid = :uuid AND c.currRole = 'driver'")
//	Optional<CurrentUserSession> findByUuidAndRoleDriver(@Param("uuid") String uuid);
	
//	@Query("SELECT c FROM CurrentUserSession c WHERE c.uuid = :uuid AND c.currRole = 'customer'")
//	Optional<CurrentUserSession> findByUuidAndCustomerRole(@Param("uuid") String uuid);
	
//	@Query("SELECT c FROM CurrentUserSession c WHERE c.uuid = :uuid AND (c.currRole = 'admin' OR c.currRole = 'customer') AND c.currRole != 'driver'")
//	Optional<CurrentUserSession> findByUuidAndNonDriverRole(@Param("uuid") String uuid);
	
	
}
