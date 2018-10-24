package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


import com.example.sample.domain.model.SampleEntity;
import com.example.sample.domain.service.SampleService;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET) 
    public List<Integer> getSample () {
        return sampleService.getSample();
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String main(Model model) {
    	    return "index";
    }

}