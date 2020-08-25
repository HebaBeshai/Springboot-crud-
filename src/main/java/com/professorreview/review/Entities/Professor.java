package com.professorreview.review.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="professors")
public class Professor implements Serializable {

    private static final long serialVersionUID = 3454353L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name ="department", nullable = false)
    private String department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Professor() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id) &&
                Objects.equals(firstName, professor.firstName) &&
                Objects.equals(lastName, professor.lastName) &&
                Objects.equals(department, professor.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, department, id);
    }

    @Override
    public String toString() {
        return "{" +
                "\"firstName\":" + "\""+firstName  +"\""+
                ",\"lastName\":" + "\""+lastName+"\""+
                ",\"department\":" + "\""+department +"\""+
                ",\"id\":"+"\""+id+"\""+
                '}';
    }
}

