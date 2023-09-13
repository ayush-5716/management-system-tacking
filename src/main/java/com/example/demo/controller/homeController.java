package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    
    @RequestMapping("/")
    public static String home(){
        return "index.html";
    }

    @RequestMapping("/complaint")
    public static String complaint(Model model){
        return "Complaint/complaint_main.html";
    }

    @RequestMapping("/add_material")
    public static String add_material(Model model){
        return "add_material/add_form.html";
    }

    @RequestMapping("/complaint/form")
    public static String complaint_form(Model model){
        return "Complaint/complaint_form.html";
    }

    @RequestMapping("/complaint/request")
    public static String requestForm(Model model){
        return "Complaint/request_form.html";
    }

    @RequestMapping("/maintenance_tracking")
    public static String maintenance(Model model){
        return "maintenanceTracking/maintenance_page.html";
    }

    @RequestMapping("/powerConsumption/leaderboard")
    public static String leaderBoard(Model model){
        return "powerConsumption/leaderBoardPage.html";
    }


}
