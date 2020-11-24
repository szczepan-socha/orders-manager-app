package com.ordersmanager.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.ordersmanager.om.client.service.ClientService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

     private final ClientService clientService;

    @Autowired
    public ViewController(ClientService clientService) {
        this.clientService = clientService;
    }



    @GetMapping("/clients")
    public String getAllClients(Model model) {
        model.addAttribute("clients", clientService.findAll());

        return "client-list";
    }

    @PostMapping("/add")
    public String create() {
        return "add-client";
    }

    @PatchMapping("/update")
    public String update() {
        return "update";
    }
}
