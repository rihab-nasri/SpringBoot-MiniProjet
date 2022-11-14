package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entity.Department;
@Repository
public interface DepartementRepository extends JpaRepository<Department,Integer> {
}
