package com.example.CustomerMasterCredit.repository;

import com.example.CustomerMasterCredit.entity.CreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<CreditEntity,Long> {
}
