package com.Prashant.smspush.controller;

import com.Prashant.smspush.modal.SMS;
import com.Prashant.smspush.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class smsController {
    public final MessageService messageService;

    @Autowired
    public smsController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = "/allsms")
    public List<SMS> getMessages(){
        return messageService.findAllSms();
    }


}
