package com.projeto.projetoAPI.controller;

import com.projeto.projetoAPI.dto.request.PersonDTO;
import com.projeto.projetoAPI.dto.response.MessageResponseDTO;
import com.projeto.projetoAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    @GetMapping
    public String getBook () {
        return "Projeto API Java";
    }

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson (@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }
}
