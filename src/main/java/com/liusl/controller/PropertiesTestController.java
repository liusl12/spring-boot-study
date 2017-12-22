package com.liusl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * created by l1 on 2017/12/19.
 */
@RestController
@RequestMapping(value = "/test")
public class PropertiesTestController {

    @Value("${book.name}")
    private String name;

    @Value("${book.auther}")
    private String auther;

    private Map map = new HashMap();
    @RequestMapping(method = RequestMethod.GET)
    public Map getProperties(){
        map.put("name",name);
        map.put("auther",auther);
        return map;
    }
}
