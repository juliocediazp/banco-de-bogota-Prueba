package Prueba.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Prueba.api.entity.Person;

public interface PruebaRepository extends JpaRepository<Person, String> {

}
