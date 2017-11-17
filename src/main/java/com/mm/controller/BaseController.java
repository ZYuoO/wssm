package com.mm.controller;

import com.mm.service.LoginService;
import com.mm.utils.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
public class BaseController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getlist(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String login = loginService.login(RequestUtils.getParameterMap(request));
        return RequestUtils.reutrnResult(RequestUtils.SUCCESS,null,login);
    }
}
