package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    //add Images
    private String image;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Customer() {
    }

//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }


    public Customer(Long id, String firstName, String lastName, String image, Province province) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.province = province;
    }

    public Customer(String firstName, String lastName, String image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
    }

    public Customer(String firstName, String lastName, String image, Province province) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s', image='%s']", id, firstName, lastName, image);
    }
}
