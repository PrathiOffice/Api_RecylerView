package com.kee.api_integration;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Model {


    private String name;

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String title;
    private String body;

    public Model(String title , String body) {
        this.title = title;
        this.body = body;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}









//    private String patientName;
//    private String phone;
//    private String dateOfBirth;
//    private String state;
//    private String country;
//    private String bloodGroup;
//    private String city;
//    private String gender;
//    private String id;
//
//    public String getPatientName() {
//        return patientName;
//    }
//
//    public void setPatientName(String patientName) {
//        this.patientName = patientName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getBloodGroup() {
//        return bloodGroup;
//    }
//
//    public void setBloodGroup(String bloodGroup) {
//        this.bloodGroup = bloodGroup;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public Model(String patientName , String phone , String dateOfBirth , String state , String country , String bloodGroup , String city , String gender , String id) {
//        this.patientName = patientName;
//        this.phone = phone;
//        this.dateOfBirth = dateOfBirth;
//        this.state = state;
//        this.country = country;
//        this.bloodGroup = bloodGroup;
//        this.city = city;
//        this.gender = gender;
//        this.id = id;
//
//
//
//
//    }
//
//}
