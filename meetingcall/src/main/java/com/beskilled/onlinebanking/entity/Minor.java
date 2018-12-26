package com.beskilled.onlinebanking.entity;

import javax.persistence.*;

@Entity
@Table(name = "minor")
public class Minor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "meeting_title", nullable = false)
    private String meetingTitle;
    @Column(name = "agenda_action", nullable = false)
    private String agendaAction;
    @Column(name = "remark", nullable = false)
    private String remark;

    /*@OneToOne
    @JoinColumn(name = "meeting_id", nullable = false)
    private Meeting meeting;
*/
}
