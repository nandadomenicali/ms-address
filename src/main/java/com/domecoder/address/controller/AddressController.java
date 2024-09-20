package com.domecoder.address.controller;

import com.domecoder.address.dto.ZipCodeDto;
import com.domecoder.address.service.ZipCodeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor
@Tag(name = "Address", description = "API for address management")
public class AddressController {

    private final ZipCodeService zipCodeService;

    @GetMapping("/{zipCode}")
    @Operation(summary = "Find address by zipCode",
    description = "Find an address by zipCode",
    tags = {"Address"},
    responses = {
            @ApiResponse(responseCode = "200", description = "Address found successfully"),
            @ApiResponse(responseCode = "404", description = "Address not found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
    })
    public ZipCodeDto getAddress(@PathVariable("zipCode") String zipCode) {
        return zipCodeService.findAddress(zipCode);
    }
}
