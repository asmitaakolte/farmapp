// package com.farmer.farmapp.controller;

// @Controller
// public class ChatWebSocketController {

//     @Autowired
//     private SimpMessagingTemplate messagingTemplate;

//     @MessageMapping("/chat.sendMessage") // From client
//     public void sendMessage(@Payload ChatMessage chatMessage) {
//         chatMessage.setTimestamp(LocalDateTime.now().toString());
//         messagingTemplate.convertAndSendToUser(
//             chatMessage.getReceiver(), "/queue/messages", chatMessage);
//     }

//     @MessageExceptionHandler
//     @SendToUser("/queue/errors")
//     public String handleException(Throwable exception) {
//         return exception.getMessage();
//     }
// }
