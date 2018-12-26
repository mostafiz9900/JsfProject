package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ann_date", nullable = false)
    private Date announceDate;
    @Column(name = "star_date", nullable = false)
    private Date meeting_date;
    @Column(name = "meeting_place", unique = true , nullable = false)
    private String meetingPlace;
    @Column(name = "agenda", nullable = false)
    private String agenda;

    @Column(name = "atatus", nullable = false)
    private String status;




   /* @ManyToMany

    private Officer officer;
    */

}
