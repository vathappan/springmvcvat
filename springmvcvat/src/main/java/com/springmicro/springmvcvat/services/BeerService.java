package com.springmicro.springmvcvat.services;

import com.springmicro.springmvcvat.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
