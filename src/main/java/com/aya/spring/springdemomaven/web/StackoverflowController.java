package com.aya.spring.springdemomaven.web;

import com.aya.spring.springdemomaven.model.StackoverflowWebsite;
import com.aya.spring.springdemomaven.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8099")
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {

    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders(){
        return stackoverflowService.findAll();
    }
}
