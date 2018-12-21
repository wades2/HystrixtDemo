package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class Services {
    @Autowired
    private RestTemplate restTemplate;

    //实现的callback方法来实现短路保护
    @HystrixCommand(fallbackMethod = "callback")
    public String routineService(String id){
        System.out.println(id);
        String jsons = restTemplate.getForObject("http://Eureka-client/user/getUser", String.class);
        return jsons;
    }

    public String callback(String id){
        String msg="出现错误id："+id;
        return msg;
    }

}
