package com.domecoder.address.controller;

import com.domecoder.address.dto.ZipCodeDto;
import com.domecoder.address.service.ZipCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {

    private final ZipCodeService zipCodeService;

    @GetMapping("/{zipCode}")
    public ZipCodeDto getAddress(@PathVariable("zipCode") String zipCode) {
        return zipCodeService.findAddress(zipCode);
    }
}
