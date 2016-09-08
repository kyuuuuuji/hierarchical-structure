package com.example.controller;

import com.example.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Store extends BaseController {

    enum View {
        INDEX("store/index"),
        DETAIL("store/detail"),
        EDIT("store/edit");
        public String html;

        View(String html) {
            this.html = html;
        }
    }

    @RequestMapping("/store")
    public String index(Model model) {
        model.addAttribute("message", "/store");
        return View.INDEX.html;
    }

    @RequestMapping("/store/detail")
    public String detail(Model model) {
        model.addAttribute("message", "/store/detail");
        return View.DETAIL.html;
    }

    @RequestMapping("/store/detail/edit")
    public String edit(Model model) {
        model.addAttribute("message", "/store/detail/edit");
        return View.EDIT.html;
    }

}
