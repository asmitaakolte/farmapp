package com.farmer.farmapp.repository;

import com.farmer.farmapp.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByLocationContainingIgnoreCase(String location);
    List<Event> findByDate(LocalDate date);
}
