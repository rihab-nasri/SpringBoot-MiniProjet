package tn.esprit.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entity.Equipe;
import tn.esprit.spring.IService.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/Equipes")
public class EquipeController {
    @Autowired
    private IEquipeService equipeService ;
    @GetMapping("/getAllEquipe")
    public List<Equipe> getAllEquipe()
    {

        return equipeService.retrieveAllEquipes();
    }

    @PostMapping("/AddEquipe")
    public Equipe AddEtudiant( @RequestBody Equipe e )
    {

        return equipeService.addEquipe(e) ;
    }

    @PutMapping("/UpdateEquipe")
    public Equipe UpdateEtudiant(@RequestBody Equipe e)
    {

        return equipeService.updateEquipe(e);
    }

    @GetMapping("/retrieve-equipe/{idE}")
    public Equipe retrieveEtudiant(@PathVariable("idE") Integer idE) {

        return equipeService.retrieveEquipe(idE);
    }

    @DeleteMapping("/remove-equipe/{Equipe-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Integer EquipeId)
    {
        equipeService.removeDepartement(EquipeId);
    }
}
