package com.example.controller;

import com.example.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer extends BaseController {

    enum View {
        INDEX("customer/index"),
        APPLICATION("customer/application");
        public String html;

        View(String html) {
            this.html = html;
        }
    }

    @RequestMapping("/customer")
    public String index(Model model) {
        model.addAttribute("message", "/customer");
        return View.INDEX.html;
    }

    @RequestMapping("/customer/application")
    public String application(Model model) {
        model.addAttribute("message", "/customer/application");
        return View.APPLICATION.html;
    }

}
