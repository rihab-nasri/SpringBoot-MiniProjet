package tn.esprit.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entity.Department;
import tn.esprit.spring.IService.IDepartementService;

import java.util.List;
@RestController
@RequestMapping("/Departements")
public class DepartmentController {
    @Autowired
    private IDepartementService departementService ;
    @GetMapping("/getAllDepartements")
    public List<Department> getAllDepartements()
    {
        return departementService.retrieveAllDepartements();
    }

    @PostMapping("/AddDepartement")
    public Department AddDepartement( @RequestBody Department d )
    {
        return departementService.addDepartement(d) ;
    }

    @PutMapping("/UpdateDepartement")
    public Department UpdateDepartement(@RequestBody Department d)
    {
        return departementService.updateDepartement(d);
    }

    @GetMapping("/retrieve-Departement/{idD}")
    public Department retrieveDepartement(@PathVariable("idD") Integer idD) {
        return departementService.retrieveDepartement(idD);
    }

    @DeleteMapping("/remove-Departement/{Departement-id}")
    public void removeDepartement(@PathVariable("Departement-id}") Integer Id) {
        departementService.removeDepartement(Id);
    }
}
