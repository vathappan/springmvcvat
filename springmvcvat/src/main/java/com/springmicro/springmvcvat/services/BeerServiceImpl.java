package com.springmicro.springmvcvat.services;

import com.springmicro.springmvcvat.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Corona")
                .beerType("Ale")
                .build();
    }
}
