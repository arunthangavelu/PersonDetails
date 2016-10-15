package com.arun.tutorial.model;

import java.util.List;
import java.util.Date;

/**
 * Created by krishvanth on 9/30/16.
 */
public class BirthDetails {


    private String dateOfBirth;
    private List<AgeDetails> age;
    private List<UpcomingBirthdayDetails> upcomingBirthday;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<AgeDetails> getAge() {
        return age;
    }

    public void setAge(List<AgeDetails> age) {
        this.age = age;
    }

    public List<UpcomingBirthdayDetails> getUpcomingBirthday() {
        return upcomingBirthday;
    }

    public void setUpcomingBirthday(List<UpcomingBirthdayDetails> upcomingBirthday) {
        this.upcomingBirthday = upcomingBirthday;
    }


}
