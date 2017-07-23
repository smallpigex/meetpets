package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.model.PetDetail;

public interface PetDetailRepository extends JpaRepository<PetDetail, Long>{
  @Query(value="SELECT D.*  FROM petdetail D WHERE D.phome_id = ?1",
      nativeQuery=true)
  public Iterable<PetDetail> findById(String id);
}
