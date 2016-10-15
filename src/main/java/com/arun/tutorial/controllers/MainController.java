package com.arun.tutorial.controllers;

import com.arun.tutorial.model.*;
import com.arun.tutorial.services.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
/**
 * Created by krishvanth on 9/25/16.
 */
@RestController
public class MainController {

    @RequestMapping(value = "/arun/family/auto", method = RequestMethod.GET)
    public ServiceResponse serviceResponse(@RequestParam(name = "person") String personName,
                                           @RequestParam(name = "date") String date) throws ParseException {
        PersonDetails personDetails = new PersonDetails();
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse = personDetails.GetPersonDetails(personName,date);

        return serviceResponse;

    }
}

