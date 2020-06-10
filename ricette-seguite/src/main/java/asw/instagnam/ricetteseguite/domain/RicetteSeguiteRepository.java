package asw.instagnam.ricetteseguite.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*; 

public interface RicetteSeguiteRepository extends CrudRepository<RicettaSeguita, Long> {

	public Collection<RicettaSeguita> findAll();

	public Collection<RicettaSeguita> findAllByUtenteFollower(String utenteFollower);

}

