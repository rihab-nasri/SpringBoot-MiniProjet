package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entity.Equipe;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
