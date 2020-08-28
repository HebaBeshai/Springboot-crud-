package com.professorreview.review.Entities;

import org.hibernate.boot.registry.selector.spi.StrategySelectionException;
import sun.util.resources.Bundles;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="employees")
public class Employee implements Serializable {

    public static final long serialVersionUID = 3453453L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String position;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public String getPosition(){
        return this.position;
    }
}
