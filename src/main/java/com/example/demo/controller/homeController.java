package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.itemRepo;
import com.example.demo.dto.memberRepo;
import com.example.demo.entities.item;
import com.example.demo.entities.member;

@Controller
public class homeController {
    
    @Autowired
    memberRepo memRepo;

    @Autowired
    itemRepo itmRepo;

    @RequestMapping("/")
    public static String home(){
        return "index.html";
    }

    @RequestMapping("/complaint")
    public static String complaint(Model model){
        return "Complaint/complaint_main.html";
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
    
    @RequestMapping("/newMember")
    public static String newMember(Model model){
        member member_temp = new member();
        model.addAttribute("memberObj", member_temp);
        return "member/newMember.html";
    }

    @PostMapping("/createMember")
    public String createMember(Model model,member member_temp){
        memRepo.save(member_temp);
        return "redirect:/newMember";
    }

    @RequestMapping("/add_material")
    public static String add_material(Model model){
        item item_temp = new item();
        model.addAttribute("itemObj", item_temp);
        return "add_material/add_form.html";
    }

    @PostMapping("/createItem")
    public String createItem(Model model,item item_temp){
        itmRepo.save(item_temp);
        return "member/newMember.html";
    }


}
