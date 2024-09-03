package org.msp.securityservice.repository;

import msp.core.repository.GenericRepository;
import org.msp.securityservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
