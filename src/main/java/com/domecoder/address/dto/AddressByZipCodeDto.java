package com.domecoder.address.dto;

public record AddressByZipCodeDto(String zipCode, String street, String complement,
                                  String neighborhood, String locale, String uf) {

    public ZipCodeDto to() {
        return ZipCodeDto.builder()
                .zipCode(this.zipCode)
                .street(this.street)
                .state(this.uf)
                .neighborhood(this.neighborhood)
                .country(this.locale)
                .build();

    }
}
