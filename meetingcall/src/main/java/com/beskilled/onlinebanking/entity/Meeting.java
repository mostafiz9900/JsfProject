package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date annDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date meetingDate;
    @Column(name = "meeting_place", unique = true , nullable = false)
    private String meetingPlace;
    @Column(name = "agenda", nullable = false)
    private String agenda;

    @Column(name = "atatus", nullable = false)
    private String status;

    @ManyToMany
    @JoinTable(
            name = "off_meet",
            joinColumns = @JoinColumn(name = "meet_id"),
            inverseJoinColumns = @JoinColumn(name = "off_id"))
    private Set<Officer> officers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAnnDate() {
        return annDate;
    }

    public void setAnnDate(Date annDate) {
        this.annDate = annDate;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Officer> getOfficers() {
        return officers;
    }

    public void setOfficers(Set<Officer> officers) {
        this.officers = officers;
    }
}
