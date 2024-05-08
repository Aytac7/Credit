package com.example.CustomerMasterCredit.service;

import com.example.CustomerMasterCredit.dto.CreditDto;
import com.example.CustomerMasterCredit.entity.CreditEntity;
import com.example.CustomerMasterCredit.mapper.CreditMapper;
import com.example.CustomerMasterCredit.repository.CreditRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditService {
     private final CreditRepository creditRepository;
     private final CreditMapper creditMapper;


     public CreditDto getCreditByCustomerId(Long customerId){
          log.info("ActionLog.getCreditByCustomerId start");
          CreditEntity creditByCustomerId= creditRepository.findById(customerId).orElseThrow(()->new RuntimeException());
          log.info("ActionLog.getCreditByCustomerId end");
          return creditMapper.entityMapToDto(creditByCustomerId);
     }


}
