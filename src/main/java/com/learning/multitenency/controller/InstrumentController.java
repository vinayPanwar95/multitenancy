package com.learning.multitenency.controller;

import com.learning.multitenency.entity.Instrument;
import com.learning.multitenency.repository.InstrumentRepository;
import com.learning.multitenency.resolver.TenantContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("instrument")
@RequiredArgsConstructor
public class InstrumentController {

    private final InstrumentRepository instrumentRepository;

    @GetMapping("tenants")
    String getTenant(){
        return TenantContext.getTenantId();
    }

    @GetMapping
    List<Instrument> getInstruments(){
        log.info("getting all the instruments");
        return instrumentRepository.findAll();
    }

    @GetMapping("type")
    public List<Instrument> getInstrumentByType(@PathVariable String type){
        log.info("Returning instrument of type: {}",type);
        return instrumentRepository.findByType(type);
    }

    @PostMapping
    Instrument addInstrument (@RequestBody Instrument instrument){
        log.info("adding instrument: {}", instrument);
        return instrumentRepository.save(instrument);
    }
}
