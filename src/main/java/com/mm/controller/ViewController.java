package com.mm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/toJsp")
public class ViewController {
    @RequestMapping("goView.do")
    public ModelAndView getPage404MV() {
        ModelAndView mv = new ModelAndView("first");
        return mv;
    }
    @RequestMapping("goMainPage.do")
    public ModelAndView goMainPage() {
        ModelAndView mv = new ModelAndView("mainPage");
        return mv;
    }
}
