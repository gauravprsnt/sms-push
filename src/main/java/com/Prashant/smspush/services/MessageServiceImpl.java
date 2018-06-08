package com.Prashant.smspush.services;

import com.Prashant.smspush.modal.SMS;
import com.Prashant.smspush.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<SMS> findAllSms() {
        return messageRepository.findAll();
    }
}
