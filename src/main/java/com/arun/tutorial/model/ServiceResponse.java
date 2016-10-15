package com.arun.tutorial.model;

import java.util.List;

/**
 * Created by krishvanth on 9/25/16.
 */
public class ServiceResponse {
    private ApartmentDetails apartment;
    private List<UserDetail> members;
    private String error;

    public String getError() {
        return error;
    }


    public void setError(String error) {
        this.error = error;
    }


    public ApartmentDetails getApartment() {
        return apartment;
    }

    public void setApartment(ApartmentDetails apartment) {
        this.apartment = apartment;
    }

    public List<UserDetail> getMember() {
        return members;
    }

    public void setMember(List<UserDetail> member) {
        this.members = member;
    }
}
