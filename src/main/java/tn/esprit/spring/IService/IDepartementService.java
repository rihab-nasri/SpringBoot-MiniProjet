package tn.esprit.spring.IService;
import tn.esprit.spring.Entity.Department;

import java.util.List;

public interface IDepartementService {

    List<Department> retrieveAllDepartements();

    Department addDepartement (Department d);

    Department updateDepartement (Department d);

    Department retrieveDepartement (Integer idDepart);
    void removeDepartement(Integer idDepartement);
}
