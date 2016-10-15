package com.arun.tutorial.services;
import com.arun.tutorial.model.*;
import com.arun.tutorial.controllers.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

/**
 * Created by krishvanth on 10/14/16.
 */
public class PersonDetails{

    public ServiceResponse GetPersonDetails(String personName,String date)
    {
        ServiceResponse serviceResponse = new ServiceResponse();
        boolean personFound = false;
        Calendar Cal = Calendar.getInstance();
        Date parsedDate;

        SimpleDateFormat source = new SimpleDateFormat("MM-dd-yyyy");


        try {
            parsedDate = source.parse(date);
            if (personName.equalsIgnoreCase("Arun") || personName.equalsIgnoreCase("renu") || personName.equalsIgnoreCase("krish")) {
                personFound = true;
            }
            if (personFound) {
                List<UserDetail> membersList = new ArrayList<>();
                serviceResponse.setApartment(populateApartmentDetails());
                membersList.add(populateMemberDetails(personName, parsedDate));
                serviceResponse.setMember(membersList);
                serviceResponse.setError("User Found");
            } else {
                serviceResponse.setError("User Not Found");
            }
        } catch (ParseException e) {

            e.printStackTrace();
        }

        return serviceResponse;

    }


    private UserDetail populateMemberDetails(String name,Date parsedDate) {
        UserDetail userDetail = new UserDetail();
        List<BirthDetails> birthDetails = new ArrayList<>();
        birthDetails.add(populateBirthDetails(name,parsedDate));


        if (name.equalsIgnoreCase("Arun")) {
            userDetail.setName("Arun");
            userDetail.setGender("male");


        } else if (name.equalsIgnoreCase("Renu")) {
            userDetail.setName("Renu");
            userDetail.setGender("female");


        } else {
            userDetail.setName("Krish");
            userDetail.setGender("male");

        }

        userDetail.setBirthDetails(birthDetails);
        return userDetail;
    }


    private BirthDetails populateBirthDetails(String name, Date parsedDate)

    {
        BirthDetails birthDetails = new BirthDetails();
        List<AgeDetails> ageDetails = new ArrayList<>();
        //Changed Date Format
        SimpleDateFormat target = new SimpleDateFormat("dd-MMM-yyyy");
        ageDetails.add(populateAgeDetails(name, parsedDate));

        List<UpcomingBirthdayDetails> upcomingBirthdayDetails = new ArrayList<>();
        upcomingBirthdayDetails.add(populateUpcomingBirthDetails(name,parsedDate));



        birthDetails.setDateOfBirth(target.format(parsedDate));



        birthDetails.setAge(ageDetails);
        birthDetails.setUpcomingBirthday(upcomingBirthdayDetails);

        return birthDetails;
    }


    private AgeDetails populateAgeDetails(String name, Date parsedDate)
    {
        LocalDate today = LocalDate.now();
        Calendar calendar = Calendar.getInstance();

        AgeDetails ageDetails = new AgeDetails();

        calendar.setTime(parsedDate);

        int month = calendar.get(Calendar.MONTH)+1;
        LocalDate birthday = LocalDate.of(calendar.get(Calendar.YEAR),month,calendar.get(Calendar.DAY_OF_MONTH));
        Period p = Period.between(birthday,today);

        ageDetails.setYears(p.getYears());
        ageDetails.setMonth(p.getMonths());
        ageDetails.setDays(p.getDays());

        return ageDetails;
    }


    private UpcomingBirthdayDetails populateUpcomingBirthDetails(String name, Date parsedDate)

    {
        LocalDate today = LocalDate.now();
        Calendar calendar = Calendar.getInstance();

        UpcomingBirthdayDetails upcomingBirthdayDetails = new UpcomingBirthdayDetails();
        calendar.setTime(parsedDate);


        int month = calendar.get(Calendar.MONTH)+1;
        LocalDate birthday = LocalDate.of(calendar.get(Calendar.YEAR),month,calendar.get(Calendar.DAY_OF_MONTH));


        LocalDate nextBday = birthday.withYear(today.getYear());
        if(nextBday.isBefore(today) || nextBday.isEqual(today))
        {
            nextBday=nextBday.plusYears(1);
        }
        Period p = Period.between(today,nextBday);

        upcomingBirthdayDetails.setYears(p.getYears());
        upcomingBirthdayDetails.setMonth(p.getMonths());
        upcomingBirthdayDetails.setDays(p.getDays());

        return upcomingBirthdayDetails;
    }

    private ApartmentDetails populateApartmentDetails() {
        ApartmentDetails apartmentDetails = new ApartmentDetails();
        apartmentDetails.setName("KTW");
        apartmentDetails.setAddress("1010 lake Street NE");
        apartmentDetails.setCity("Hopkins");
        apartmentDetails.setZipcode("55343");
        return apartmentDetails;
    }
}


