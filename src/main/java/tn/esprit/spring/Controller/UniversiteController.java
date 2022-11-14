package tn.esprit.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entity.Universite;
import tn.esprit.spring.IService.IUniversiteService;

import java.util.List;
@RestController
@RequestMapping("/Universites")
public class UniversiteController {
    @Autowired
    private IUniversiteService UniversiteService ;


    @GetMapping("/getAllUniversites")
    public List<Universite> getAllUniversites()
    {

        return UniversiteService.retrieveAllUniversites();
    }

    @PostMapping("/AddUniversite")
    public Universite AddUniversite( @RequestBody Universite U )
    {

        return UniversiteService.addUniversite(U) ;
    }

    @PutMapping(value = "/affecter-Universite-departement/{universiteID}/{departementID}")
    public void affecterUniversiteToDepartement(@PathVariable("universiteID") Integer universiteID,
                                              @PathVariable("departementID")Integer departementID)
    {
        UniversiteService.assignUniversiteToDepartement(universiteID,departementID);
    }

    @PutMapping("/UpdateUniversite")
    public Universite UpdateUniversite(@RequestBody Universite U)
    {

        return UniversiteService.updateUniversite(U);
    }

    @GetMapping("/retrieve-Universites/{idU}")
    public Universite retrieveUniversite(@PathVariable("idE") Integer idU)
    {
        return UniversiteService.retrieveUniversite(idU);
    }

    @DeleteMapping("/remove-Universite/{Universite-id}")
    public void removeUniversite(@PathVariable("Universite-id") Integer UniversiteId)
    {
        UniversiteService.removeUniversite(UniversiteId);
    }
}
