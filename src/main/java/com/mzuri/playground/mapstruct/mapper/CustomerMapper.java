package com.mzuri.playground.mapstruct.mapper;

import com.mzuri.playground.mapstruct.dto.Customer;
import com.mzuri.playground.mapstruct.dto.CustomerDto;
import com.mzuri.playground.mapstruct.dto.Title;
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

    default String toTitle(Title title) {
        if(title == null) return null;
        return title.value;
    }

    default Title map(String value) {
        if(value == null) return null;
        Title title = new Title();
        title.value = value;
        return title;
    }

    @InheritInverseConfiguration
    CustomerDto fromCustomer(Customer customer);
}