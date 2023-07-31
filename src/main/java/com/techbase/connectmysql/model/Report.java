package com.techbase.connectmysql.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "report")
public class Report {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="time")
    private Integer timeReport;
    @Column(name="kind_of_spam")
    private Integer kindOfSpam;
    @Column(name="content_spam")
    private Integer contentSpam;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "spam_id")
    private Spammer spammer;

}
