package com.projeto.projetoAPI.service;

import com.projeto.projetoAPI.dto.response.MessageResponseDTO;
import com.projeto.projetoAPI.entity.Person;
import com.projeto.projetoAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson (Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build();
    }
}
