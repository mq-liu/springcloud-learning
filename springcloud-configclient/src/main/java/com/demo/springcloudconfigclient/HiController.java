package com.demo.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

//    @Value("${hello}")
//    private String hello;
//
//    @RequestMapping("/hello")
//    public String index(@RequestParam String name) {
//        return name+","+this.hello;
//    }


    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hello")
    public String hi(){
        return foo;
    }

}
