package com.example.CustomerMasterCredit.mapper;

import com.example.CustomerMasterCredit.dto.CreditDto;
import com.example.CustomerMasterCredit.entity.CreditEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CreditMapper {

    CreditDto entityMapToDto(CreditEntity creditEntity);
    CreditEntity dtoMapToEntity(CreditDto creditDto);
}
