package com.liusl.controller;

import com.liusl.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * created by l1 on 2017/12/19.
 */
@Controller
@RequestMapping(value = "/person")
public class singlePersonController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        Person singlePerson = new Person("liusl12",24);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("a",1);
        Person p2 = new Person("b",2);
        Person p3 = new Person("c",3);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",singlePerson);
        model.addAttribute("people",people);
        return "index";
    }
}
