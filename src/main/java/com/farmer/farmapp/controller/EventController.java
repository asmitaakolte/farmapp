package com.farmer.farmapp.controller;

import com.farmer.farmapp.entity.Event;
import com.farmer.farmapp.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:3001")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping
    public List<Event> getAll() {
        return service.getAll();
    }

    @GetMapping("/location")
    public List<Event> getByLocation(@RequestParam String location) {
        return service.getByLocation(location);
    }

    @GetMapping("/date")
    public List<Event> getByDate(@RequestParam String date) {
        return service.getByDate(LocalDate.parse(date));
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return service.addEvent(event);
    }
}
