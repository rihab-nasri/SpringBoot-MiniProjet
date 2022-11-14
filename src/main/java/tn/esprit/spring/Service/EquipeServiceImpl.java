package tn.esprit.spring.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entity.Department;
import tn.esprit.spring.Entity.DetailEquipe;
import tn.esprit.spring.Entity.Equipe;
import tn.esprit.spring.IService.IEquipeService;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.DetailEquipeRepository;
import tn.esprit.spring.repository.EquipeRepository;

import java.util.List;
@Service
@Slf4j

public class EquipeServiceImpl implements IEquipeService {

    @Autowired
    EquipeRepository EquipeRepo;
    DetailEquipeRepository detailEquipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        List<Equipe> equipe=EquipeRepo.findAll();
        for(Equipe E: equipe)
        {
            log.info("Equipe"+E.toString());
        }
        return equipe;
    }

    @Override
    public Equipe addEquipe(Equipe e) {
       // DetailEquipe detailEquipe=e.getDetailequipe(); cascade manuiellement
       // detailEquipeRepository.save(detailEquipe);
        //e.setDetailequipe(detailEquipe);
       return  EquipeRepo.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return EquipeRepo.save(e);

    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return EquipeRepo.findById(idEquipe).get();

    }
    @Override
    public void removeDepartement(Integer idDepartement) {

        EquipeRepo.deleteById(idDepartement);
    }
}
