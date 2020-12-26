package com.example.dockerdemo.controller;

import com.example.dockerdemo.entities.Contact;
import com.example.dockerdemo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable int id) {
        return contactRepository.findById(id).get();
    }
}
