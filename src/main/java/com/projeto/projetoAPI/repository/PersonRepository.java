package com.projeto.projetoAPI.repository;

import com.projeto.projetoAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
