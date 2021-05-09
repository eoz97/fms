package com.fms.domain.faxnumber;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaxnumberRepository extends JpaRepository<Faxnumber, Long> {
}
