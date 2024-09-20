package com.domecoder.address.client;

import com.domecoder.address.dto.AddressByZipCodeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ViaCepClient {

    @GetMapping("/ws/{cep}/json")
    AddressByZipCodeDto findAddress(@PathVariable() String zipCode);

}
