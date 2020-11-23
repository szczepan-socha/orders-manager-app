package com.ordersmanager.om.controller;

import com.ordersmanager.om.client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.ordersmanager.om.client.service.ClientService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewController {

     private ClientService clientService;

    @Autowired
    public ViewController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    //GET all clients
    @GetMapping("/clients")
    public String getAllClients(Model model){
        model.addAttribute("clients", clientService.findAll());
        return "client-list";
    }

    // GET view add-client form
    @GetMapping("/add-client")
    public String viewAddClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "add-client";
    }

    // SAVE client in database and go back to client-list view
    @PostMapping("/add-client")
    public RedirectView addNewClient(@ModelAttribute("client") Client client){
        clientService.saveClient(client);
        return new RedirectView("/clients");
    }


}
