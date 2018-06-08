package com.wz.messerver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @GetMapping("msg")
    public String mesServer(){
        return "this is mes Server";
    }
}
