package tn.esprit.spring.Service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entity.Contrat;
import tn.esprit.spring.Entity.Department;
import tn.esprit.spring.IService.IDepartementService;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.DepartementRepository;

import java.util.List;
@Service
@Slf4j

public class DepartementServiceImpl implements IDepartementService {
    @Autowired
    DepartementRepository DepartmentRepo;
    @Override
    public List<Department> retrieveAllDepartements() {
        List<Department> departement=DepartmentRepo.findAll();
        for(Department d: departement)
        {
            log.info("Departement"+d.toString());
        }
        return departement;

    }

    @Override
    public Department addDepartement(Department d) {
        return DepartmentRepo.save(d);

    }

    @Override
    public Department updateDepartement(Department d) {

        return DepartmentRepo.save(d);
    }

    @Override
    public Department retrieveDepartement(Integer idDepart) {
        return DepartmentRepo.findById(idDepart).get();

    }
    @Override
    public void removeDepartement(Integer idDepartement) {
        DepartmentRepo.deleteById(idDepartement);

    }
}
