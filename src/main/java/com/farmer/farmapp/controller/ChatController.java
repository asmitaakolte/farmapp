package com.farmer.farmapp.controller;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.farmer.farmapp.entity.Message;
import com.farmer.farmapp.repository.MessageRepository;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "http://localhost:3001")
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        message.setTimestamp(LocalDateTime.now());
        return messageRepository.save(message);
    }

    @GetMapping("/history")
    public List<Message> getChatHistory(
        @RequestParam String sender,
        @RequestParam String receiver
    ) {
        return messageRepository.findBySenderUsernameAndReceiverUsernameOrReceiverUsernameAndSenderUsername(
            sender, receiver, sender, receiver);
    }
}

