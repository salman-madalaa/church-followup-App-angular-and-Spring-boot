package com.ZionFellowshipChurch.Followup.ModelClasses;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import com.ZionFellowshipChurch.Followup.ModelClasses.followupPerson;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by Lenovo on 17-03-2020.
 */
@Entity
@Table(name = "followup")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private Long phoneNumber;


    @Column
    @CreationTimestamp
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date date;

    @Column
    private String prayerRequest;


    @Column(name = "person_id")
    private  Integer personId;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrayerRequest() {
        return prayerRequest;
    }

    public void setPrayerRequest(String prayerRequest) {
        this.prayerRequest = prayerRequest;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}
