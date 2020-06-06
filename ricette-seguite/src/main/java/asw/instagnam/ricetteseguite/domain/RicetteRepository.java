package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*; 

public interface RicetteRepository extends CrudRepository<Ricetta, Long> {

	public Collection<Ricetta> findAll();

	public Collection<Ricetta> findAllByAutore(String autore);

}

