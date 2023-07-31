package com.techbase.connectmysql.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "spammer")
public class Spammer {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "verified")
    private Boolean verified;

    @JsonIgnore
    @OneToMany(mappedBy = "spammer")
    private List<Report> reports;
}
