package com.example.demo.controller;

        import com.example.demo.service.Services;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    private Services service;

    @RequestMapping(value = "getUser/routine",method = RequestMethod.GET)
    public String routine(@RequestParam String id){
        String json=service.routineService(id);
        return json;
    }
}
