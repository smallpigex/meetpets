package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.model.PetHome;

public interface PetHomeRepository extends JpaRepository<PetHome, Long> {
  @Query(value="SELECT D.id, D.lat, D.lng, D.description, CONCAT(CASE WHEN D.name IS NOT NULL THEN D.name ELSE (SELECT U.name FROM user U WHERE U.fbid=D.uid) END ,'之家')AS name, D.uid  FROM pethome D",
      nativeQuery=true)
  public Iterable<PetHome> findAllNoNullName();
}
