package com.ctu.vn.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @Column(name="id")
    private Integer idlUser;
    @Column(name="email")
    private String emailUser;
    @Column(name="password")
    private String passwordUser;

}
