package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {
    // Autowire for CRUD access and db access
    @Autowired
    private SessionRepository sessionRepository;

    // list method that returns all sessions when called
    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    // get method that returns a specific session
    @GetMapping
    @RequestMapping("{id")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

//    @PostMapping
//    // so that it maps 201, not 200
//    // @ResponseStatus(HttpStatus.CREATED)
//    public Session create(@RequestBody final Session session) {
//        return sessionRepository.saveAndFlush(session);
//    }

}
