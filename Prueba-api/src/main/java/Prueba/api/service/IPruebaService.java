package Prueba.api.service;

import java.util.List;

import Prueba.api.entity.Person;

public interface IPruebaService {

	List<Person> buscarTodos();
	void guardar(Person person);
	void eliminar(String fullname);
}
