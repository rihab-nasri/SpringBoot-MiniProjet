package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entity.Universite;
@Repository
public interface UniversityRepository extends JpaRepository<Universite,Integer> {
}
