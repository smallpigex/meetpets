package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.model.Hospital;

public interface HospitalRepository extends CrudRepository<Hospital, Long> {

}
