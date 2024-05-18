package org.msp.profileservice.repository;

import org.msp.profileservice.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfileRepo extends JpaRepository<Profile,Long> {
}
