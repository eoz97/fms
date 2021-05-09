package com.fms.domain.faxnumberuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaxnumberUserRepository extends JpaRepository<FaxnumberUser, Long> {
}
