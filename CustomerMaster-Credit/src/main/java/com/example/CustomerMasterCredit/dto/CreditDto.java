package com.example.CustomerMasterCredit.dto;

import com.example.CustomerMasterCredit.enums.CreditStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditDto {
    Long id;
    Double amount;
    Long customerId;
    CreditStatus creditStatus;

}
