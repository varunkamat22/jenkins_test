package com.example.dockerdemo.repository;

import com.example.dockerdemo.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
