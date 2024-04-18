package com.test.lesson08;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("some")
@RequiredArgsConstructor
public class SomeController {

    @Autowired
    private final SomeService service;

    @GetMapping()
    public String getMethod(){
        try {
            service.someMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "result";
    }

}
