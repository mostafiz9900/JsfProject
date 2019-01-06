package com.beskilled.onlinebanking.controller;

import com.beskilled.onlinebanking.repo.MeetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeetingController {
    @Autowired
    private MeetingRepo repo;
    @GetMapping(value = "/add.jsp")
    public String meetingAdd(Model model){
        return null;
    }
}
