package com.domecoder.address.dto;

public record BrazilAddressApiDto(String zipCode, String street, String complement,
                                  String neighborhood, String city, String state){

    public ZipCodeDto to() {
        return ZipCodeDto.builder()
                .zipCode(this.zipCode)
                .street(this.street)
                .neighborhood(this.neighborhood)
                .city(this.city)
                .state(this.state)
                .build();
    }
}
