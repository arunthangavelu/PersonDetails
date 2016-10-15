package com.arun.test;

import com.arun.tutorial.model.*;
import org.junit.Test;
import com.arun.tutorial.controllers.MainController;
import org.junit.Assert;
import java.text.ParseException;


/* Created by krishvanth on 9/26/16.  */
public class MainControllerTest {

    //If PersonName is not Arun,Renu,Krish then Appartment and Member should be NUll and Error = "User Not Found"  
    @Test
    public void testInvalidUserScenario() {
        MainController mainController = new MainController();
        ServiceResponse serviceResponse = new ServiceResponse();
        try{

            serviceResponse = mainController.serviceResponse("abc","15-11-1987");
        }catch (ParseException p)
        {

        }
        Assert.assertNull(serviceResponse.getApartment());
        Assert.assertNull(serviceResponse.getMember());
        Assert.assertEquals("User Not Found", serviceResponse.getError());
    }

    @Test

    public void testArunScenario() {
        MainController mainController = new MainController();
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse = mainController.serviceResponse("arun","11-15-1987");
        } catch (ParseException p) {

        }
        Assert.assertNotNull(serviceResponse.getApartment());
        Assert.assertEquals("User Found", serviceResponse.getError());
        Assert.assertNotNull(serviceResponse.getMember());
        Assert.assertEquals(serviceResponse.getApartment().getName(), "KTW");
        Assert.assertEquals(serviceResponse.getApartment().getAddress(), "1010 lake Street NE");
        Assert.assertEquals(serviceResponse.getApartment().getCity(), "Hopkins");
        Assert.assertEquals(serviceResponse.getApartment().getZipcode(), "55343");
        Assert.assertNotNull(serviceResponse.getMember().get(0).getName());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getGender());
        Assert.assertEquals(serviceResponse.getMember().get(0).getName(), "Arun");
        Assert.assertEquals(serviceResponse.getMember().get(0).getGender(), "male");


        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getDays());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getMonth());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears());


        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth());
        Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth(), "15-11-1987");
        Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears(),0);
    }


    @Test

    public void testKrishScenario() {
        MainController mainController = new MainController();
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse = mainController.serviceResponse("krish","06-08-2015");
        } catch (ParseException p) {

        }
        Assert.assertNotNull(serviceResponse.getApartment());
        Assert.assertEquals("User Found", serviceResponse.getError());
        Assert.assertNotNull(serviceResponse.getMember());
        Assert.assertEquals(serviceResponse.getApartment().getName(), "KTW");
        Assert.assertEquals(serviceResponse.getApartment().getAddress(), "1010 lake Street NE");
        Assert.assertEquals(serviceResponse.getApartment().getCity(), "Hopkins");
        Assert.assertEquals(serviceResponse.getApartment().getZipcode(), "55343");
        Assert.assertNotNull(serviceResponse.getMember().get(0).getName());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getGender());
        Assert.assertEquals(serviceResponse.getMember().get(0).getName(), "Krish");
        Assert.assertEquals(serviceResponse.getMember().get(0).getGender(), "male");


        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getDays());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getMonth());
        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears());


        Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth());
        Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth(), "08-06-2015");
        Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears(),0);
    }



@Test

public void testRenuScenario()
        {
        MainController mainController = new MainController();
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
        serviceResponse = mainController.serviceResponse("renu","09-21-1990");
        } catch (ParseException p) {

        }
        Assert.assertNotNull(serviceResponse.getApartment());
        Assert.assertEquals("User Found", serviceResponse.getError());
        Assert.assertNotNull(serviceResponse.getMember());
        Assert.assertEquals(serviceResponse.getApartment().getName(), "KTW");
            Assert.assertEquals(serviceResponse.getApartment().getAddress(), "1010 lake Street NE");
            Assert.assertEquals(serviceResponse.getApartment().getCity(), "Hopkins");
            Assert.assertEquals(serviceResponse.getApartment().getZipcode(), "55343");
            Assert.assertNotNull(serviceResponse.getMember().get(0).getName());
            Assert.assertNotNull(serviceResponse.getMember().get(0).getGender());
            Assert.assertEquals(serviceResponse.getMember().get(0).getName(), "Renu");
            Assert.assertEquals(serviceResponse.getMember().get(0).getGender(), "female");

            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getAge().get(0).getDays());
            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getAge().get(0).getMonth());
            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getAge().get(0).getYears());


            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getDays());
            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getMonth());
            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears());

            Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getUpcomingBirthday().get(0).getYears(),0);


            Assert.assertNotNull(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth());
            Assert.assertEquals(serviceResponse.getMember().get(0).getBirthDetails().get(0).getDateOfBirth(), "21-09-1990");


        }
}

