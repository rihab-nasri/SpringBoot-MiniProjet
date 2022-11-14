package tn.esprit.spring.IService;

import tn.esprit.spring.Entity.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
