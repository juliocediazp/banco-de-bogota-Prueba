package Prueba.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prueba.api.entity.Person;
import Prueba.api.repository.PruebaRepository;
import Prueba.api.service.IPruebaService;

@Service
public class PruebaService implements IPruebaService {

	@Autowired
	private PruebaRepository repoPrueba;
	
	public List<Person> buscarTodos() {
	
		
		
		return repoPrueba.findAll();
		
	
	}

	public void guardar(Person person) {
	Person  pers = new Person();
		
		if(person.getFullname() == null) {
			
		}
		repoPrueba.save(person);
	}

	public void eliminar(String fullname) {
		repoPrueba.deleteById(fullname);
	}

}
