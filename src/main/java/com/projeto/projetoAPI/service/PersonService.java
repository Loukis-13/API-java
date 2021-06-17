package com.projeto.projetoAPI.service;

import com.projeto.projetoAPI.dto.request.PersonDTO;
import com.projeto.projetoAPI.dto.response.MessageResponseDTO;
import com.projeto.projetoAPI.entity.Person;
import com.projeto.projetoAPI.mapper.PersonMapper;
import com.projeto.projetoAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson (PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build();
    }
}
