package com.professorreview.review.model;

public class teacherParameters {
    private String firstName;
    private String lastName;
    private String Subject;
    private Long id;

    public teacherParameters(){}

    public String getfirstName(){
       return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String firstName){
        this.firstName=firstName;
    }
    public String getSubject(){
        return Subject;
    }
    public void setSubject(String Subject){
        this.Subject=Subject;
    }
    public Long getID(){
        return id;
    }
    public void setId(Long id){
        this.id= id;
    }

    
}
