package com.example.daohibernate.controller;

import com.example.daohibernate.service.PeopleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/persons")
public class PeopleController {
    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }


    @ResponseBody
    @GetMapping("/by-city")
    public String getPersonsByCity(@RequestParam String city) throws JsonProcessingException {
        return peopleService.getPersonsByCity(city);
    }
}
