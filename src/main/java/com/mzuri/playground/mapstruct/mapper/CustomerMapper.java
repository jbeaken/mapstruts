package com.mzuri.playground.mapstruct.mapper;

import com.mzuri.playground.mapstruct.dto.Customer;
import com.mzuri.playground.mapstruct.dto.CustomerDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "orders", target = "orderItems")
    @Mapping(source = "customerName", target = "name")
    @Mapping(target = "dateOfBirth", dateFormat = "dd/MM/yyyy")
//    @Mapping(target = "creditScore")
    Customer toCustomer(CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerDto fromCustomer(Customer customer);
}