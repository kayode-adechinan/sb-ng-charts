package com.adechinan.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/stats")
@RequiredArgsConstructor
@CrossOrigin
public class StatAPI {
    private final StatRepository statRepository;

    @GetMapping
    public List<Stat> all(){
        return this.statRepository.findAll();
    }
}
