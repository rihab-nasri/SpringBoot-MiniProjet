package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entity.Etudiant;
import tn.esprit.spring.Entity.Niveau;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

   List<Etudiant> findByDepartementsIdDepart(Integer idDepart);
   // List<Etudiant> findByEquipesNiveau(Niveau niveau);
}
