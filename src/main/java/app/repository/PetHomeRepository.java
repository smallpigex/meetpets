package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.PetHome;

public interface PetHomeRepository extends CrudRepository<PetHome, Long> {
  
}
