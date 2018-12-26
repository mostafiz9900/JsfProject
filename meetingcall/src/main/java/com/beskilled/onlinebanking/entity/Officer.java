package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "officer")
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "officer_name", unique = true, nullable = false)
    private String userName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "mobile", unique = true)
    private String mobile;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "lase_name", nullable = false)
    private String lastName;
    @Column(name = "reg_date")
    private Date regDate;
   /* @ManyToOne
    @JoinColumn(name = "deg_id" , nullable = false)
    private Designation designation;
*/

}
