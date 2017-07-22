package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.PetDetail;

public interface PetDetailRepository extends CrudRepository<PetDetail, Long>{

}
