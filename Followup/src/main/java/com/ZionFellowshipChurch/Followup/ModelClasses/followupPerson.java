package com.ZionFellowshipChurch.Followup.ModelClasses;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 29-03-2020.
 */
@Entity
@Table(name = "followupPerson")
public class followupPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Long personId;

    @Column
    private String name;

    @Column
    private Long phone;



    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }



}
