package com.example.demo.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private EurekaClient eurekaClients;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("getUser")
    public String getUser() {
        //todo 得到eureka server的服务实例
//        try{
//            Thread.sleep(60000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        return "hello client2";
    }
}

