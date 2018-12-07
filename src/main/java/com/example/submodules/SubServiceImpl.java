package com.example.submodules;

import org.springframework.stereotype.Service;

/**
 * @author aniewielska
 * @since 07/12/2018
 */
@Service
public class SubServiceImpl implements SubService {
    @Override
    public String introduceYourself() {
        return "Hello World!";
    }
}
