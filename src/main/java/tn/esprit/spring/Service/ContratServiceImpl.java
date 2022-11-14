package tn.esprit.spring.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entity.Contrat;
import tn.esprit.spring.IService.IContratService;
import tn.esprit.spring.repository.ContratRepository;

import java.util.List;

@Service
@Slf4j
public class ContratServiceImpl implements IContratService {
   @Autowired
    ContratRepository ContratRepo;
    @Override
    public List<Contrat> retrieveAllContrats() {
        List<Contrat> contrat=ContratRepo.findAll();
        for(Contrat c: contrat)
        {
            log.info("contrat"+c.toString());
        }
        return contrat;
    }

    @Override
    public Contrat updateContrat(Contrat ce) {

        return ContratRepo.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return ContratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return ContratRepo.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
        ContratRepo.deleteById(idContrat);

    }
}
