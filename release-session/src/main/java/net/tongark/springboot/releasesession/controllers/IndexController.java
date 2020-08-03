package net.tongark.springboot.releasesession.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class IndexController {
    @ResponseBody
    @GetMapping(value = "/session")
    public Map<String, Object> getSession(HttpServletRequest request) {
        HttpSession httpSession=request.getSession();
        // 添加数据到Session
        httpSession.setAttribute("username", "admin");
        // 添加sessionID到Map
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", httpSession.getId());
        return map;
    }

    @ResponseBody
    @GetMapping(value = "/get")
    public String get(HttpServletRequest request) {
        // 获取Session数据
        String userName = (String) request.getSession().getAttribute("username");
        return userName;
    }

    @ResponseBody
    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        // 销毁sessioin
        request.getSession().invalidate();
        return "ok";
    }
}
