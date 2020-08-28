package com.professorreview.review.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="teachers")
public class Teacher implements Serializable {

    private static final long serialVersionUID =4574565675L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="subject", nullable = false)
    private String Subject;


    public void Teacher(){

    }

    public String getFirstName(){

        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getSubject(){
        return Subject;
    }
    public void setSubject(String Subject){
        this.Subject=Subject;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id)&&
                Objects.equals(firstName,teacher.firstName)&&
                Objects.equals(lastName, teacher.lastName)&&
                Objects.equals(Subject, teacher.Subject);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, firstName, lastName, Subject);
}
    @Override
    public String toString(){
    return "{" +
            "\"firstName\":" + "\""+firstName  +"\""+
            ",\"lastName\":" + "\""+lastName+"\""+
            ",\"department\":" + "\""+Subject +"\""+
            ",\"id\":"+"\""+id+"\""+
            '}';

}

}
