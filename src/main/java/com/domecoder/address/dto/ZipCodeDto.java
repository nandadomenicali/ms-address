package com.domecoder.address.dto;

import lombok.Builder;

@Builder
public record ZipCodeDto(String zipCode, String street, String city,
                         String state, String neighborhood) {
}
