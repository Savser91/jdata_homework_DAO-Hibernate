package com.example.daohibernate.service;

import com.example.daohibernate.entity.Person;
import com.example.daohibernate.repository.PeopleRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleService {
    private PeopleRepository peopleRepository;
    private ObjectMapper objectMapper = new ObjectMapper();

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public String getPersonsByCity(String city) throws JsonProcessingException {
        List<Person> personsOfCity = peopleRepository.getPersonsByCity(city);
        String result = objectMapper.writeValueAsString(personsOfCity);
        return result;
    }
}
