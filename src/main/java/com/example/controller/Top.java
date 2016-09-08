package com.example.controller;

import com.example.controller.base.BaseController;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Top extends BaseController {

    enum View {
        TOP("top");
        public String html;

        View(String html) {
            this.html = html;
        }
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "/");
        return View.TOP.html;
    }

}
