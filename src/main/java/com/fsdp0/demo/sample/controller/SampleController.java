package com.fsdp0.demo.sample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("sample")
public class SampleController {
    @GetMapping
    public String test() {
        return "OK";
    }
}
