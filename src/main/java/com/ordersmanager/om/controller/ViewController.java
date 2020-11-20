package com.ordersmanager.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.ordersmanager.om.client.service.ClientService;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

     private ClientService clientService;

    @Autowired
    public ViewController(ClientService clientService) {
        this.clientService = clientService;
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
