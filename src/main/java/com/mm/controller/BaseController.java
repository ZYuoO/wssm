package com.mm.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class BaseController {
    @RequestMapping("goView.do")
    public ModelAndView getPage404MV() {
        ModelAndView mv = new ModelAndView("first");
        return mv;
    }
}
