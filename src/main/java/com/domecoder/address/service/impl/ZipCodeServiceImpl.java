package com.domecoder.address.service.impl;

import com.domecoder.address.client.BrazilApiClient;
import com.domecoder.address.client.ViaCepClient;
import com.domecoder.address.dto.ZipCodeDto;
import com.domecoder.address.service.ZipCodeService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ZipCodeServiceImpl implements ZipCodeService {

    private final ViaCepClient viaCepClient;
    private final BrazilApiClient brazilApiClient;

    @Override
    @CircuitBreaker(name = "address", fallbackMethod = "fallBackFindAddress")
    public ZipCodeDto findAddress(String zipCode) {
        return viaCepClient.findAddress(zipCode).to();
    }

    public ZipCodeDto fallBackFindAddress(String zipCode, Exception e) {
        return brazilApiClient.findAddress(zipCode).to();
    }
}
