package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @program: neo4j_demo
 * @description:
 * @author: 安少军
 * @create: 2022-09-20 15:38
 **/
@RestController
public class TestController {
    //http://localhost:8201/swagger-ui.html
    @RequestMapping("/t")
    public String t(){
        return "";
    }
    @PostConstruct
    public void aa(){
        System.out.println("");
    }
}
