package com.bimface.hack.controller;

import com.bimface.hack.bean.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ComponentController {
    @Autowired
    private SimpMessageSendingOperations messagingTemplate;


    @PutMapping("component")
    @ResponseBody
    public GeneralResponse sendComponent(@RequestParam(value = "componentId")String componentId, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        System.out.println(sessionId);


        messagingTemplate.convertAndSend("/command", componentId);

        return new GeneralResponse();
    }
}
