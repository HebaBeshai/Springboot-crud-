package com.professorreview.review.model;

public class professorParam {
    private String name;
    private Long id;

    public professorParam(){}

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

}
