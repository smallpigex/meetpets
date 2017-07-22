package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.model.PetHome;

public interface PetHomeRepository extends JpaRepository<PetHome, Long> {
  @Query(value="SELECT D.id, D.latitude, D.logtitude, D.description, CASE WHEN D.name IS NOT NULL THEN D.name ELSE D.uid END FROM pethome D",
      nativeQuery=true)
  public List<PetHome> findAllNoNullName();
}
