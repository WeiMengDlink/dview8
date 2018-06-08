package com.mz.app.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mz.app.client.GoodsClient;



@RestController
@Slf4j
public class CallController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("callService")
    public String callServer(){
        String res=restTemplate.getForObject("http://GOODS/msg",String.class);
//      String res=goodsClient.getMes();
      //log.info("res--{}",res);
      return res;
    }
    @GetMapping("halo")
    public  String say(){
        return "halo spring cloud!";
    }
   @GetMapping("/callFei")
   public String getMsgByFeign(){
       String res=goodsClient.getMes();
       //log.info("res--{}",res);
       return res;
}

}