package com.beskilled.onlinebanking.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    @Column(name = "desig_name", nullable = false)
private String designationName;
   /* @ManyToOne
    @JoinColumn
    private User officer;
*/
}
