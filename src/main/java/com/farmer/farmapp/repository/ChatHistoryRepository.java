package com.farmer.farmapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmer.farmapp.entity.ChatHistory;

public interface ChatHistoryRepository extends JpaRepository<ChatHistory, Long> {
    List<ChatHistory> findByRecipient(String username);
    List<ChatHistory> findByGroupName(String groupName);
}

