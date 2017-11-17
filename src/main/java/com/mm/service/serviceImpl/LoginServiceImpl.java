package com.mm.service.serviceImpl;

import com.mm.core.mapper.LoginMapper;
import com.mm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapp;
    public String login(Map<String, Object> map) {
        Map<String, Object> userMap = loginMapp.login(map.get("userId").toString());
        if (userMap!=null){
            if (userMap.get("userId").equals(map.get("userId").toString())&&userMap.get("password").equals(map.get("password"))){
                return "登录成功";
            }else {
                return "账户或密码错误";
            }
        }else {
            return "暂无此用户";
        }
    }
}
