package com.Prashant.smspush.services;

import com.Prashant.smspush.modal.SMS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<SMS> findAllSms();
}
