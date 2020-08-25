package com.professorreview.review.model;

public class studentParameters {
    private String name;
    private String lastName;
    private String address;
    private int year;

    public studentParameters(){

    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
}
