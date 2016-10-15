package com.arun.tutorial.model;
import java.util.List;


/**
 * Created by krishvanth on 9/25/16.
 */
public class UserDetail {
    private String name;
    private String gender;
    private List<BirthDetails> birthDetails;


    public List<BirthDetails> getBirthDetails() {
        return birthDetails;
    }

    public void setBirthDetails(List<BirthDetails> birthDetailsList) {
        this.birthDetails = birthDetailsList;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
