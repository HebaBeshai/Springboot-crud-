package com.professorreview.review.Entities;

public class Student {

    private int studentID;
    private String fname;
    private String lname;
    private String address;
    private int year;

   public Student(){

    }

    public int getStudentID(){
        return studentID;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public String getAddress(){
        return address;
    }
    public int getYear(){
        return year;
    }
    //setters
    public void setFname(String new_fName){
        fname = new_fName;
    }
    public void setLname(String new_lName){
        lname = new_lName;
    }
    public void setAddress(String new_Address){
        address = new_Address;
    }
    public void setYear(int new_Year){
        year = new_Year;
    }
    public void setStudentID(int new_StudentID){
        studentID = new_StudentID;
    }
    public String toString(){
        String result;
        result="studentId = " +studentID+"\nfirst name= " +fname+"\nlast name= " +lname+"\naddress= "+address+"\nyear= "+year;
        return result;
   }
}

