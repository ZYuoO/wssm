package com.mm.service;

import org.springframework.stereotype.Service;

import java.util.Map;
public interface LoginService {
    String login(Map<String,Object> map);
}
