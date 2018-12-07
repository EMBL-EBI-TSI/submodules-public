package com.example.submodules;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aniewielska
 * @since 07/12/2018
 */
@RestController
public class SubController {

    private final SubService service;

    public SubController(SubService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return this.service.introduceYourself();
    }
}
