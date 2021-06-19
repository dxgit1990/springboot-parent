package com.dx.demo.conttroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dx
 * @create 2021/6/19 14:31
 * @for new
 */
@RestController
public class HelloController {


    @GetMapping("/hi")
    public String test(){
        return "hi";
    }
}
