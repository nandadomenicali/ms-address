package com.domecoder.address.service;

import com.domecoder.address.dto.ZipCodeDto;

public interface ZipCodeService {
    ZipCodeDto findAddress(String zipCode);
}
