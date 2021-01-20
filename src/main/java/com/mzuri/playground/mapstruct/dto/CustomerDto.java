/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mzuri.playground.mapstruct.dto;

import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class CustomerDto {

    public Long id;
    public String customerName;
    public List<OrderItemDto> orders;
    public String dateOfBirth;
    public double creditScore;
}
