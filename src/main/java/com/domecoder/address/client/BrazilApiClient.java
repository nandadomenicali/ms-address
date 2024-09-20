package com.domecoder.address.client;

import com.domecoder.address.dto.AddressByZipCodeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "brazilApi", url = "https://brasilapi.com.br/")
public interface BrazilApiClient {

    @GetMapping("/api/cep/v1/{cep}")
    AddressByZipCodeDto findAddress(@PathVariable("cep") String zipCode);

}
