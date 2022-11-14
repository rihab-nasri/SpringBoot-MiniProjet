package tn.esprit.spring.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entity.Etudiant;
import tn.esprit.spring.IService.IEtudiantService;

import java.util.List;
@Tag(name = "Etudiant Management")
@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private IEtudiantService EtudiantService ;

    @Operation(description = "Retrieve all products")
    @GetMapping("/getAllEtudiant")
    public List<Etudiant> getAllEtudiant()
    {
        return EtudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/AddEtudiant")
    public Etudiant AddEtudiant( @RequestBody Etudiant e )
    {
        return EtudiantService.addEtudiant(e) ;
    }

    @PutMapping(value = "/affecter-etudiant-departement/{etudiantID}/{departementID}")
    public void affecterEtudiantToDepartement(@PathVariable("etudiantID") Integer etudiantID,
                                               @PathVariable("departementID")Integer departementID)
    {
        EtudiantService.assignEtudiantToDepartement(etudiantID,departementID);
    }
    @PutMapping(value = "/affecter-etudiant-equipe-Contrat/{etudiant}/{ContratId}/{EquipeId}")
    public void affecterEtudiantToDepartement(@PathVariable("etudiant") Etudiant e ,
                                              @PathVariable("ContratId") Integer ContratId,
                                              @PathVariable("EquipeId")Integer EquipeId)
    {
        EtudiantService.addAndAssignEtudiantToEquipeAndContract(e,ContratId,EquipeId);
    }

    @PutMapping("/UpdateEtudiant")
    public Etudiant UpdateEtudiant(@RequestBody Etudiant e)
    {
        return EtudiantService.updateEtudiant(e);
    }

    @GetMapping("/retrieve-etudiant/{idE}")
    public Etudiant retrieveEtudiant(@PathVariable("idE") Integer idE) {
        return EtudiantService.retrieveEtudiant(idE);
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Integer etudiantId) {
        EtudiantService.removeEtudiant(etudiantId);
    }
    @GetMapping("/getAllEtudiant/{idDepart}")
    public List<Etudiant> findByDepartementsIdDepart(Integer idDepart)
    {
        return EtudiantService.findByDepartementsIdDepart(idDepart);
    }
}
