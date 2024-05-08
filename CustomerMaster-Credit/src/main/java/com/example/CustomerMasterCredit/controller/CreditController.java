package com.example.CustomerMasterCredit.controller;

import com.example.CustomerMasterCredit.dto.CreditDto;
import com.example.CustomerMasterCredit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credits")
@RequiredArgsConstructor
public class CreditController {
    private final CreditService creditService;

    @GetMapping("{customerId}")
    public CreditDto getCreditByCustomerId(@PathVariable Long customerId ){
        return creditService.getCreditByCustomerId(customerId);
    }

}
