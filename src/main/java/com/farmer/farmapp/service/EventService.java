package com.farmer.farmapp.service;

import com.farmer.farmapp.entity.Event;
import com.farmer.farmapp.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    private final EventRepository repo;

    public EventService(EventRepository repo) {
        this.repo = repo;
    }

    public List<Event> getAll() {
        return repo.findAll();
    }

    public List<Event> getByLocation(String location) {
        return repo.findByLocationContainingIgnoreCase(location);
    }

    public List<Event> getByDate(LocalDate date) {
        return repo.findByDate(date);
    }

    public Event addEvent(Event event) {
        return repo.save(event);
    }
}
