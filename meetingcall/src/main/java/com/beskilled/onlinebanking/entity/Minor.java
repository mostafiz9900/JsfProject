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

   @OneToOne
    @JoinColumn(name = "meeting_id", nullable = false)
    private Meeting meeting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getAgendaAction() {
        return agendaAction;
    }

    public void setAgendaAction(String agendaAction) {
        this.agendaAction = agendaAction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
}
