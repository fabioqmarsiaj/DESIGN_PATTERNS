package com.fabioqmarsiaj.designpatterns.factory.controller;

import com.fabioqmarsiaj.designpatterns.builder.Contact;
import com.fabioqmarsiaj.designpatterns.builder.ContactBuilder;
import com.fabioqmarsiaj.designpatterns.factory.Pet;
import com.fabioqmarsiaj.designpatterns.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class FactoryController {

    @Autowired
    private PetFactory petFactory;

    @PostMapping("petFactory/{type}/{name}")
    public Pet petFactory(@PathVariable String type, @PathVariable String name) {
        Pet pet = this.petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

    @GetMapping("builder")
    public List<Contact> contactBuilder(){

        //Without BUILDER pattern...
        List<Contact> contacts = new ArrayList<>();

        Contact contact = new Contact();
        contact.setFirstName("Fabio");
        contact.setLastName("Marsiaj");
        contact.setEmail("xxx@email.com");

        contacts.add(contact);

        //With BUILDER pattern...
        contacts.add(new ContactBuilder().setFirstName("Fabio").setLastName("Marsiaj").setEmail("xxx@gmail.com").buildContact());

        return contacts;
    }
}
